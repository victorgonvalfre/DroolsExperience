package br.edu.sr.ifes.mpn.model;


public class Testemunha {
	private Pessoa pessoa;
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	
	@Override
	public String toString() {
		return "Testemunha [pessoa=" + pessoa + "]";
	}
	public Testemunha(){
		
	}

}