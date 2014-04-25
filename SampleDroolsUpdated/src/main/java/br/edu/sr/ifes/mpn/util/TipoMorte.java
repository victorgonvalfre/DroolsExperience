package br.edu.sr.ifes.mpn.util;

public enum TipoMorte {	
	DoencaContagiosa(0), Outros(1);

	public final int iD;

	private TipoMorte(int Id){
		this.iD = Id;
	}

}
