package br.edu.sr.ifes.mpn.model;

import java.util.ArrayList;
import java.util.List;

public class Instituicao {
	private String nome;
	private String fantasia;
	private String sigla;
	private String email;
	private List<Captacao> lstCaptacoesRelizadas = new ArrayList<Captacao>();
	
	public String getNome() {
		return nome;
	}
	public List<Captacao> getLstCaptacoesRelizadas() {
		return lstCaptacoesRelizadas;
	}
	
	public void addItenInThelist(Captacao captacao){
		this.lstCaptacoesRelizadas.add(captacao);
	}
	
	public void setLstCaptacoesRelizadas(List<Captacao> lstCaptacoesRelizadas) {
		this.lstCaptacoesRelizadas = lstCaptacoesRelizadas;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFantasia() {
		return fantasia;
	}
	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
