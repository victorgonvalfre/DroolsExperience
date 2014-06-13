package br.edu.sr.ifes.mpn.model;


public class Testemunha extends Pessoa {
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Testemunha [cpf=" + cpf + "]";
	}
}