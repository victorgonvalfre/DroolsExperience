package br.edu.sr.ifes.mpn.model;

import br.edu.sr.ifes.mpn.util.Parentesco;

public class Responsavel extends Pessoa{
	private String nacionalidade;
	private String profissao;
	private String documentoSocial;
	private Parentesco parentesco;
	
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
	public Parentesco getParentesco() {
		return parentesco;
	}
	public void setParentesco(Parentesco parentesco) {
		this.parentesco = parentesco;
	}
	
	@Override
	public String toString() {
		return "Responsavel [documentoSocial=" + documentoSocial
				+ ", parentesco=" + parentesco + "]";
	}
	
}
