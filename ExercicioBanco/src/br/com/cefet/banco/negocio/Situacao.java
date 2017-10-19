package br.com.cefet.banco.negocio;

public enum Situacao {
	EMEXERCICIO("Em exerc�cio"),
	EMFERIAS("Em f�rias"),
	AFASTADOPORDOENCA("Afastado por doen�a"),
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
