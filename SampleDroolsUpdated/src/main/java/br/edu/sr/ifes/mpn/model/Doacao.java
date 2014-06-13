package br.edu.sr.ifes.mpn.model;

import java.util.Calendar;
import java.util.Date;

public class Doacao {
	private boolean autorizado;
	private Testemunha testemunha;
	private Responsavel responsavelLegal;
	
	private Obito obito;
	private Date dataEntradaDoacao;
	private long delayTime;
		
	public Doacao(boolean auth, Obito obito){
		this.autorizado = auth;
		this.obito = obito;
		this.setDataEntradaDoacao();
	}
	
	public Doacao(boolean auth, Obito obito, boolean tempoEstourado){
		this.autorizado = auth;
		this.obito = obito;
		if(tempoEstourado == true){
			this.setDataEntradaDoacaoEstourado();
		}
		
	}
	
	public long getDelayTime() {
		
		if(this.obito != null){
		return dataEntradaDoacao.getTime() - this.obito.getDataObito().getTime();
		}
		else return 0;
	}
	
	public void setDelayTime(long delayTime) {
		this.delayTime = delayTime;
	}
	
	public Obito getObito() {
		return obito;
	}
	public Date getDataEntradaDoacao() {
		return dataEntradaDoacao;
	}
	public void setDataEntradaDoacao() {
       	Calendar cal = Calendar.getInstance();
       	Date dateAux = cal.getTime();
       	dateAux.setHours(dateAux.getHours()+1);
       	
		this.dataEntradaDoacao = dateAux;
	}
	
	public void setDataEntradaDoacaoEstourado() {
       	Calendar cal = Calendar.getInstance();
       	Date dateAux = cal.getTime();
       	dateAux.setHours(dateAux.getHours()+12);
       	
		this.dataEntradaDoacao = dateAux;
	}
	public void setObito(Obito obito) {
		this.obito = obito;
	}
	public boolean isAutorizado() {
		return autorizado;
	}
	public void setAutorizado(boolean autorizado) {
		this.autorizado = autorizado;
	}
	public Testemunha getTestemunha() {
		return testemunha;
	}
	public void setTestemunha(Testemunha testemunha) {
		this.testemunha = testemunha;
	}
	public Responsavel getResponsavelLegal() {
		return responsavelLegal;
	}
	public void setResponsavelLegal(Responsavel responsavelLegal) {
		this.responsavelLegal = responsavelLegal;
	}
	
	@Override
	public String toString() {
		return "Doacao [autorizado=" + autorizado + ", testemunha=" + testemunha
				+ ", responsavelLegal=" + responsavelLegal + "]";
	}
}