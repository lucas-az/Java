package br.com.cefet.banco.negocio;

public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(Cliente titular, int numero) {
		super(titular, numero);
	}
	
	public void imprimirResumo() {
		System.out.println("------Conta Corrente------");
		super.imprimirResumo();
	}

	public void atualiza(double taxa) {
		try {
			this.sacar(taxa * 2);
		}catch(SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void depositar(double valor) throws ValorInvalidoException {
		super.depositar(valor - 0.10);
	}

	public double calcularTributos() {
		return this.getSaldo() * 0.01;
	}
}
