package br.com.cefet.banco.negocio;

public enum Situacao {
	EMEXERCICIO("Em exercício"),
	EMFERIAS("Em férias"),
	AFASTADOPORDOENCA("Afastado por doença"),
	EXONERADO("Exonerado"),
	APOSENTADO("Aposentado");
	
	private String situacao;
	
	Situacao(String estado) {
		situacao = estado;
	}
	
	public String toString() {
		return situacao;
	}
}
