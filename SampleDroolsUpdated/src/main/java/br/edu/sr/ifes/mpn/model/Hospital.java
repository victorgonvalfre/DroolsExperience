package br.edu.sr.ifes.mpn.model;

public class Hospital extends Instituicao{
	private String sigla;
	private Endereco endereco;
	
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
