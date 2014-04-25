package br.edu.sr.ifes.mpn.util;

public enum TipoRecusa {
	RecusaFamiliar(0),ContraIndicacaoMedica(1);

	public final int iD;

	private TipoRecusa(int Id){
		this.iD = Id;
	}

}