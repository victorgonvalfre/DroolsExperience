package br.edu.sr.ifes.mpn.model;

public class Endereco {
	public String logradouro;
	public long cep;
	public int numero;
	public String complemento;
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public long getCep() {
		return cep;
	}
	public void setCep(long cep) {
		this.cep = cep;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", cep=" + cep
				+ ", numero=" + numero + ", complemento=" + complemento + "]";
	}

}
