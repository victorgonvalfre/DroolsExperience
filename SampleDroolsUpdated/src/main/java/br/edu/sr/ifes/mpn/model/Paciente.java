package br.edu.sr.ifes.mpn.model;

import java.util.Date;
import br.edu.sr.ifes.mpn.util.TipoPaciente;

public class Paciente extends Pessoa{
	private Date dataInternacao;
	private Date dataNascimento;
	private String profissao;
	private String nomeMae;
	private String numeroProntuario;
	private String numeroSUS;
	private String nacionalidade;
	private String documentoSocial;
	private TipoPaciente tipoPaciente;
	private Responsavel responsavel;
	
	
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
	public String getNumeroSUS() {
		return numeroSUS;
	}
	public void setNumeroSUS(String numeroSUS) {
		this.numeroSUS = numeroSUS;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getDocumentoSocial() {
		return documentoSocial;
	}
	public void setDocumentoSocial(String documentoSocial) {
		this.documentoSocial = documentoSocial;
	}
	public TipoPaciente getTipoPaciente() {
		return tipoPaciente;
	}
	public void setTipoPaciente(TipoPaciente tipoPaciente) {
		this.tipoPaciente = tipoPaciente;
	}
	public Responsavel getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}
	
	@Override
	public String toString() {
		return "Paciente [dataInternacao=" + dataInternacao + ", nomeMae="
				+ nomeMae + ", numeroProntuario=" + numeroProntuario
				+ ", numeroSUS=" + numeroSUS + ", documentoSocial="
				+ documentoSocial + "]";
	}
}
