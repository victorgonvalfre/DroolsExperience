package br.edu.sr.ifes.mpn.util;

public enum Sexo {
Masculino(0), Feminino(1), Outros(2);

public final int iD;

private Sexo(int Id){
	this.iD = Id;
}
}