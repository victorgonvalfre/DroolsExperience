package br.edu.sr.ifes.mpn.model;

import java.util.Calendar;
import java.util.Date;

public class Captacao {
	private boolean realizada;
	private Doacao doacao;
	private Date dataEntradaCaptacao;
	private long delayTime;
	
	public Captacao(Doacao doacao){
		this.doacao = doacao;
		this.setDataEntradaCaptacao();
	}
	
	public long getDelayTime() {
		
		if(this.doacao != null && this.doacao.getObito() != null){
		return dataEntradaCaptacao.getTime() - this.doacao.getObito().getDataObito().getTime();
		}
		else return 0;
	}
	
	public void setDelayTime(long delayTime) {
		this.delayTime = delayTime;
	}
	
	public Date getDataEntradaCaptacao() {
		return dataEntradaCaptacao;
	}
	public void setDataEntradaCaptacao() {
       	Calendar cal = Calendar.getInstance();
       	Date dateAux = cal.getTime();
       	dateAux.setHours(dateAux.getHours()+2);
       	
		this.dataEntradaCaptacao = dateAux;
	}
	public boolean isRealizada() {
		return realizada;
	}
	public void setRealizada(boolean realizada) {
		this.realizada = realizada;
	}
	public Doacao getDoacao() {
		return doacao;
	}
	public void setDoacao(Doacao doacao) {
		this.doacao = doacao;
	}
	@Override
	public String toString() {
		return "Captacao [realizada=" + realizada + ", doacao=" + doacao + "]";
	}
	
	public Captacao(){
		
	}

}