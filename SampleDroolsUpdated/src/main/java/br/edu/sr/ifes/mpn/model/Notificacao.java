package br.edu.sr.ifes.mpn.model;

import java.util.Date;

public class Notificacao {
	private String codigo;
	private Date dataNotificacao;
	private Obito obito;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Date getDataNotificacao() {
		return dataNotificacao;
	}
	public void setDataNotificacao(Date dataNotificacao) {
		this.dataNotificacao = dataNotificacao;
	}
	public Obito getObito() {
		return obito;
	}
	public void setObito(Obito obito) {
		this.obito = obito;
	}
	
	@Override
	public String toString() {
		return "Notificacao [codigo=" + codigo + ", dataNotificacao="
				+ dataNotificacao + "]";
	}
	
	public Notificacao(){
		
	}

}
