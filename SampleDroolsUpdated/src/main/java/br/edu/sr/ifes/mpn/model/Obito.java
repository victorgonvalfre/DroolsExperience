package br.edu.sr.ifes.mpn.model;

import java.util.Date;

import br.edu.sr.ifes.mpn.util.TipoMorte;

public class Obito {
	private Date dataObito;
	private Date dataEvento;
	private boolean aptoDoacao;
	private Paciente paciente;
	private CausaMortis causaMortis;
	private Setor setor;
	
	public Date getDataObito() {
		return dataObito;
	}

	public void setDataObito(Date dataObito) {
		this.dataObito = dataObito;
	}

	public Date getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}

	public boolean isAptoDoacao() {
		if(this.causaMortis.getTipoMorte().equals(TipoMorte.Outros)){
			return true;
		}
		else{
			return false;
		}
	}

	public void setAptoDoacao(boolean aptoDoacao) {
		this.aptoDoacao = aptoDoacao;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public CausaMortis getCausaMortis() {
		return causaMortis;
	}

	public void setCausaMortis(CausaMortis causaMortis) {
		this.causaMortis = causaMortis;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	@Override
	public String toString() {
		return "Obito [dataObito=" + dataObito + ", dataEvento=" + dataEvento
				+ ", aptoDoacao=" + aptoDoacao + "]";
	}
}
