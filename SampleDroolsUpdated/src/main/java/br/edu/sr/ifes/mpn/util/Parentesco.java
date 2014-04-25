package br.edu.sr.ifes.mpn.util;

public enum Parentesco {
Conjuge(0),Irmao(1),Pais(2),Avos(3),Tios(4),Outros(5);

public final int iD;

private Parentesco(int Id){
	this.iD = Id;
}

}
