package br.edu.sr.ifes.mpn.model;

import java.util.Calendar;
import java.util.Date;

public class Captacao {
	private boolean coorneadCaptadas;
	private boolean equipeDisponivel;
	private Doacao doacao;
	private Pessoa analista;
	private Pessoa captador;
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

	public Doacao getDoacao() {
		return doacao;
	}
	public void setDoacao(Doacao doacao) {
		this.doacao = doacao;
	}

	public boolean isCoorneadCaptadas() {
		return coorneadCaptadas;
	}

	public void setCoorneadCaptadas(boolean coorneadCaptadas) {
		this.coorneadCaptadas = coorneadCaptadas;
	}

	public boolean isEquipeDisponivel() {
		return equipeDisponivel;
	}

	public void setEquipeDisponivel(boolean equipeDisponivel) {
		this.equipeDisponivel = equipeDisponivel;
	}

	public Pessoa getAnalista() {
		return analista;
	}

	public void setAnalista(Pessoa analista) {
		this.analista = analista;
	}

	public Pessoa getCaptador() {
		return captador;
	}

	public void setCaptador(Pessoa captador) {
		this.captador = captador;
	}

	public void setDataEntradaCaptacao(Date dataEntradaCaptacao) {
		this.dataEntradaCaptacao = dataEntradaCaptacao;
	}

	@Override
	public String toString() {
		return "Captacao [coorneadCaptadas=" + coorneadCaptadas
				+ ", equipeDisponivel=" + equipeDisponivel
				+ ", dataEntradaCaptacao=" + dataEntradaCaptacao + "]";
	}

	
}