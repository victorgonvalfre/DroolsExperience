package br.edu.sr.ifes.mpn.model;

import br.edu.sr.ifes.mpn.util.EstadoCivil;
import br.edu.sr.ifes.mpn.util.Parentesco;
import br.edu.sr.ifes.mpn.util.Sexo;

public class ResponsavelLegal {
	private Pessoa pessoa;
	private String nacionalidade;
	private String profissao;
	private String documentoSocial;
	private EstadoCivil estadoCivil;
	private Sexo sexo;
	private Parentesco parentesco;
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}	
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getDocumentoSocial() {
		return documentoSocial;
	}
	public void setDocumentoSocial(String documentoSocial) {
		this.documentoSocial = documentoSocial;
	}
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public Parentesco getParentesco() {
		return parentesco;
	}
	public void setParentesco(Parentesco parentesco) {
		this.parentesco = parentesco;
	}
	
	@Override
	public String toString() {
		return "ResponsavelLegal [nacionalidade=" + nacionalidade
				+ ", profissao=" + profissao + ", documentoSocial="
				+ documentoSocial + ", estadoCivil=" + estadoCivil + ", sexo="
				+ sexo + ", parentesco=" + parentesco + "]";
	}
	
	public ResponsavelLegal(){
		
	}
	
}
