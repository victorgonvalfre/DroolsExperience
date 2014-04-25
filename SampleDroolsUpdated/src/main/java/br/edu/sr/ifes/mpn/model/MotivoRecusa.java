package br.edu.sr.ifes.mpn.model;

import br.edu.sr.ifes.mpn.util.TipoRecusa;

public class MotivoRecusa {
	private String descricao;
	private TipoRecusa tipoRecusa;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public TipoRecusa getTipoRecusa() {
		return tipoRecusa;
	}
	public void setTipoRecusa(TipoRecusa tipoRecusa) {
		this.tipoRecusa = tipoRecusa;
	}
	
	@Override
	public String toString() {
		return "MotivoRecusa [descricao=" + descricao + ", tipoRecusa="
				+ tipoRecusa + "]";
	}
	
	public MotivoRecusa(){
		
	}
}