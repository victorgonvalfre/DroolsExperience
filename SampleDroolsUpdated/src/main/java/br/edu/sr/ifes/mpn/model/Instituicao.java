package br.edu.sr.ifes.mpn.model;

public class Instituicao {
	private long id;
	private String nome;
	private String cnes;
	private String email;
	private String fantasia;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnes() {
		return cnes;
	}
	public void setCnes(String cnes) {
		this.cnes = cnes;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFantasia() {
		return fantasia;
	}
	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}
	
	@Override
	public String toString() {
		return "Instituicao [id=" + id + ", nome=" + nome + "]";
	}
	
	
}
