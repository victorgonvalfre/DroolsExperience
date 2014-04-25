package br.edu.sr.ifes.mpn.util;

public enum Encaminhado {
Svo(0), Iml(1), NaoEncaminhado(2);

public final int iD;

private Encaminhado(int Id){
	this.iD = Id;
}
}