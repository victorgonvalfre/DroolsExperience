package br.edu.sr.ifes.mpn.model;

import java.util.Date;

import br.edu.sr.ifes.mpn.util.Encaminhado;
import br.edu.sr.ifes.mpn.util.LocalMorte;

public class Obito {
	private Date dataObito;
	private Paciente paciente;
	private ResponsavelLegal responsavelLegal;
	private CausaMortis causaMortis;
	private Encaminhado encaminhado;
	private LocalMorte localMorte;
	
	public LocalMorte getLocalMorte() {
		return localMorte;
	}
	public void setLocalMorte(LocalMorte localMorte) {
		this.localMorte = localMorte;
	}
	public Date getDataObito() {
		return dataObito;
	}
	public void setDataObito(Date dataObito) {
		this.dataObito = dataObito;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	public ResponsavelLegal getResponsavelLegal() {
		return responsavelLegal;
	}
	public void setResponsavelLegal(ResponsavelLegal responsavelLegal) {
		this.responsavelLegal = responsavelLegal;
	}
	public CausaMortis getCausaMortis() {
		return causaMortis;
	}
	public void setCausaMortis(CausaMortis causaMortis) {
		this.causaMortis = causaMortis;
	}
	public Encaminhado getEncaminhado() {
		return encaminhado;
	}
	public void setEncaminhado(Encaminhado encaminhado) {
		this.encaminhado = encaminhado;
	}
	
	@Override
	public String toString() {
		return "Obito [dataObito=" + dataObito + ", paciente=" + paciente
				+ ", causaMortis=" + causaMortis + ", encaminhado="
				+ encaminhado + "]";
	}
	
	public Obito(){
		
	}
	
}
