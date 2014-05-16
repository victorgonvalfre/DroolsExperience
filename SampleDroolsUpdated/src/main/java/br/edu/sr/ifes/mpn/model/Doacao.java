package br.edu.sr.ifes.mpn.model;

import java.util.Calendar;
import java.util.Date;

public class Doacao {
	private boolean autorizado;
	private MotivoRecusa motivoRecusa;
	private Testemunha testemunha;
	private ResponsavelLegal responsavelLegal;
	private Obito obito;
	private Date dataEntradaDoacao;
	private long delayTime;
	
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
	public void setObito(Obito obito) {
		this.obito = obito;
	}
	public boolean isAutorizado() {
		return autorizado;
	}
	public void setAutorizado(boolean autorizado) {
		this.autorizado = autorizado;
	}
	public MotivoRecusa getMotivoRecusa() {
		return motivoRecusa;
	}
	public void setMotivoRecusa(MotivoRecusa motivoRecusa) {
		this.motivoRecusa = motivoRecusa;
	}
	public Testemunha getTestemunha() {
		return testemunha;
	}
	public void setTestemunha(Testemunha testemunha) {
		this.testemunha = testemunha;
	}
	public ResponsavelLegal getResponsavelLegal() {
		return responsavelLegal;
	}
	public void setResponsavelLegal(ResponsavelLegal responsavelLegal) {
		this.responsavelLegal = responsavelLegal;
	}
	
	@Override
	public String toString() {
		return "Doacao [autorizado=" + autorizado + ", motivoRecusa="
				+ motivoRecusa + ", testemunha=" + testemunha
				+ ", responsavelLegal=" + responsavelLegal + "]";
	}
	
	public Doacao(){
		
	}
}