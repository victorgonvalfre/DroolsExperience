package br.edu.sr.ifes.mpn.util;

public enum EstadoCivil {
Solteiro(0), Casado(1), Divorciado(2), Viuvo(3);

public final int iD;

private EstadoCivil(int Id){
	this.iD = Id;
}

}