package br.edu.sr.ifes.mpn.model;

import java.util.Date;

import br.edu.sr.ifes.mpn.util.EstadoCivil;
import br.edu.sr.ifes.mpn.util.Sexo;
import br.edu.sr.ifes.mpn.util.TipoPaciente;

public class Paciente {
	
	private Pessoa pessoa;
	private Date dataInternacao;
	private Date dataNascimento;
	private String profissao;
	private String nomePai;
	private String nomeMae;
	private String numeroProntuario;
	private String documentoSocial;
	private String nacionalidade;
	private EstadoCivil estadoCivil;
	private TipoPaciente tipoPaciente;
	private Sexo sexo;
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Date getDataInternacao() {
		return dataInternacao;
	}
	public void setDataInternacao(Date dataInternacao) {
		this.dataInternacao = dataInternacao;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNumeroProntuario() {
		return numeroProntuario;
	}
	public void setNumeroProntuario(String numeroProntuario) {
		this.numeroProntuario = numeroProntuario;
	}
	public String getDocumentoSocial() {
		return documentoSocial;
	}
	public void setDocumentoSocial(String documentoSocial) {
		this.documentoSocial = documentoSocial;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public TipoPaciente getTipoPaciente() {
		return tipoPaciente;
	}
	public void setTipoPaciente(TipoPaciente tipoPaciente) {
		this.tipoPaciente = tipoPaciente;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		return "Paciente [dataInternacao=" + dataInternacao
				+ ", dataNascimento=" + dataNascimento + ", profissao="
				+ profissao + ", nomePai=" + nomePai + ", nomeMae=" + nomeMae
				+ ", numeroProntuario=" + numeroProntuario
				+ ", documentoSocial=" + documentoSocial + ", nacionalidade="
				+ nacionalidade + ", estadoCivil=" + estadoCivil
				+ ", tipoPaciente=" + tipoPaciente + ", sexo=" + sexo + "]";
	}
	
	public Paciente(){
		
	}
}
