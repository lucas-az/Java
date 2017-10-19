package br.com.cefet.banco.negocio;

public class GerenciadorDeImpostoDeRenda {
	private double total;
	
	public void adiciona(Tributavel tributavel) {
		this.total += tributavel.calcularTributos();
	}
	
	public double getTotal() {
		return this.total;
	}
}
