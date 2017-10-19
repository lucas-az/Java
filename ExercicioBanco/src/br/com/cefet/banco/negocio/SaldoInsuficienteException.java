package br.com.cefet.banco.negocio;

public class SaldoInsuficienteException extends Exception{
	public SaldoInsuficienteException(String message) {
		super(message);
	}
}
