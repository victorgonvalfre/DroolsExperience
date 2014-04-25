package br.edu.sr.ifes.mpn.util;

public enum TipoPaciente {
Crianca(0), Adulto(1), RecemNascido(2),NaoIdentificados(3);

public final int iD;

private TipoPaciente(int Id){
	this.iD = Id;
}

}