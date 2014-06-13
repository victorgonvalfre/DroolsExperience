package br.edu.sr.ifes.mpn.model;

import br.edu.sr.ifes.mpn.util.TipoMorte;


public class CausaMortis {
	private String descricao;
	private TipoMorte tipoMorte;

	public TipoMorte getTipoMorte() {
		return tipoMorte;
	}

	public void setTipoMorte(TipoMorte tipoMorte) {
		this.tipoMorte = tipoMorte;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "CausaMortis [descricao=" + descricao + "]";
	}
}