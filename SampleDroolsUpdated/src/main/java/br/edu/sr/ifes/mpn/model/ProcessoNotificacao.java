package br.edu.sr.ifes.mpn.model;

import java.util.Date;
import java.util.List;
import br.edu.sr.ifes.mpn.util.*;

public class ProcessoNotificacao {
	private String codigo;
	private Date dataAbertura;
	private Date dataArquivamento;
	private Obito obito;
	private boolean arquivado;
	private long delayTime;
	private Funcionario notificador;
	private List<EstadoProcessoNotificacao> historico;


	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public Date getDataArquivamento() {
		return dataArquivamento;
	}

	public void setDataArquivamento(Date dataArquivamento) {
		this.dataArquivamento = dataArquivamento;
	}

	public Obito getObito() {
		return obito;
	}

	public void setObito(Obito obito) {
		this.obito = obito;
	}

	public boolean isArquivado() {
		return arquivado;
	}

	public void setArquivado(boolean arquivado) {
		this.arquivado = arquivado;
	}

	public long getDelayTime() {
		return delayTime;
	}

	public void setDelayTime(long delayTime) {
		this.delayTime = delayTime;
	}
	
	public List<EstadoProcessoNotificacao> getHistorico() {
		return historico;
	}

	public Funcionario getNotificador() {
		return notificador;
	}

	public void setNotificador(Funcionario notificador) {
		this.notificador = notificador;
	}

	public void setHistorico(List<EstadoProcessoNotificacao> historico) {
		this.historico = historico;
	}
	
	public boolean aptDoacao(){
		return this.obito.isAptoDoacao();
	}
	
	public boolean doacaoAutorizado(){
		return true;
	}

	public long getDelayToNotify() {
		
		if(this.obito != null){
		return dataAbertura.getTime() - this.obito.getDataObito().getTime();
		}
		else return 0;
	}
	
	@Override
	public String toString() {
		return "Notificacao [codigo=" + codigo + "]";
	}
	
}
