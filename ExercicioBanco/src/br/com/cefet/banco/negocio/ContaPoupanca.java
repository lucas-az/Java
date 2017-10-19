package br.com.cefet.banco.negocio;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente titular, int numero) {
		super(titular, numero);
	}
	
	public void imprimirResumo() {
		System.out.println("------Conta Poupança------");
		super.imprimirResumo();
	}
	
	public void atualiza(double taxa) {
		try {
			this.sacar(taxa * 3);
		}catch(SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
