package br.com.cefet.banco.negocio;

public abstract class Conta implements Comparable<Conta> {
	
	private Cliente titular;
	private int numero;
	private double saldo, limite;
	
	public Conta(Cliente titular, int numero) {
		this.titular = titular;
		this.numero = numero;
		this.saldo = 0;
		this.limite = 100;
	}
	
	public int compareTo(Conta outra) {
		if(this.numero < outra.numero)
			return -1;
		else if(this.numero > outra.numero)
				return 1;
			else
				return 0;
	}
	
	public void imprimirResumo() {
		System.out.println("Titular: " + this.titular.getNome());
		System.out.println("Saldo atual: " + this.getSaldo());
		System.out.println("--------------------------");
	}
	
	public abstract void atualiza(double taxa);
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public double getLimite() {
		return this.limite;
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public void sacar(double valor) throws SaldoInsuficienteException{
		
		if((this.saldo + this.limite) >= valor){
			this.saldo -= valor;
		}
		else
			throw new SaldoInsuficienteException("Saldo insuficiente!");
	}
	
	public void depositar(double valor) throws ValorInvalidoException {
		
		if(valor > 0) 
			this.saldo += valor;
		else
			throw new ValorInvalidoException("Valor inválido");
	}
	
	public void transferir(double valor, Conta destinatario){
		try {
			this.sacar(valor);
			destinatario.depositar(valor);
		}catch(SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}catch(ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
	}
}
