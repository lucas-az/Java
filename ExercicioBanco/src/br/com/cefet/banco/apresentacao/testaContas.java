package br.com.cefet.banco.apresentacao;

import br.com.cefet.banco.negocio.Conta;
import br.com.cefet.banco.negocio.ContaCorrente;
import br.com.cefet.banco.negocio.ContaPoupanca;
import br.com.cefet.banco.negocio.SaldoInsuficienteException;
import br.com.cefet.banco.negocio.Cliente;

public class testaContas {

	public static void main(String[] args) {
		Cliente t = new Cliente("Eu", "123", "Rua ali mesmo");
		Conta c = new ContaCorrente(t, 0);
		ContaCorrente cc = new ContaCorrente(t, 0);
		ContaPoupanca cp = new ContaPoupanca(t, 0);
		
		c.depositar(1000);
		cc.depositar(1000);
		cp.depositar(1000);
		
		try {
			c.sacar(10000);
		}catch(SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Saldo das contas antes de atualizar: ");
		System.out.println("Conta c: " + c.getSaldo());
		System.out.println("Conta cc: " + cc.getSaldo());
		System.out.println("Conta cp: " + cp.getSaldo());
		
		c.atualiza(5);
		cc.atualiza(5);
		cp.atualiza(5);
		
		System.err.println("Saldo das contas depois de atualizar: ");
		System.err.println("Conta c: " + c.getSaldo());
		System.err.println("Conta cc: " + cc.getSaldo());
		System.err.println("Conta cp: " + cp.getSaldo());

	}

}
