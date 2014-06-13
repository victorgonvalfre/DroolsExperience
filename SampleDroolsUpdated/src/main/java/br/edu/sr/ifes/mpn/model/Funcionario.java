package br.edu.sr.ifes.mpn.model;

public class Funcionario extends Pessoa {
	private String login;
	private String senha;
	private boolean ativo;
	private String cpf;
	private String DocumentoSocial;
	private String email;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDocumentoSocial() {
		return DocumentoSocial;
	}
	public void setDocumentoSocial(String documentoSocial) {
		DocumentoSocial = documentoSocial;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Funcionario [ativo=" + ativo + ", cpf=" + cpf + "]";
	}
	
}
