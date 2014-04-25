package br.edu.sr.ifes.mpn.model;

public class Captacao {
	private boolean realizada;
	private Doacao doacao;
	public boolean isRealizada() {
		return realizada;
	}
	public void setRealizada(boolean realizada) {
		this.realizada = realizada;
	}
	public Doacao getDoacao() {
		return doacao;
	}
	public void setDoacao(Doacao doacao) {
		this.doacao = doacao;
	}
	@Override
	public String toString() {
		return "Captacao [realizada=" + realizada + ", doacao=" + doacao + "]";
	}
	
	public Captacao(){
		
	}

}