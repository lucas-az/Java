package br.com.cefet.banco.apresentacao;

import br.com.cefet.banco.negocio.Conta;
import br.com.cefet.banco.negocio.ContaCorrente;
import br.com.cefet.banco.negocio.ContaPoupanca;
import br.com.cefet.banco.negocio.Cliente;
import br.com.cefet.banco.negocio.Banco;

public class TesteContaCliente {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Lucas", "123", "Rua 0");
		Cliente c2 = new Cliente("Pedro", "456", "Rua 1");
		Cliente c3 = new Cliente("Joao", "789", "Rua 2");
		
		Conta c = new ContaPoupanca(c1, 123);
		ContaCorrente cc = new ContaCorrente(c2, 456);
		ContaPoupanca cp = new ContaPoupanca(c3, 789);
		
		Banco b = new Banco("Banco 01", "Rua 2", "111");
		
		b.adicionarConta(c);
		b.adicionarConta(cc);
		b.adicionarConta(cp);
		
		System.out.println("Antes de atualizar contas");
		b.imprimirRelatorioDeContas();
		
		b.atualizarContas(5);
		
		System.out.println("Depois de atualizar contas");
		b.imprimirRelatorioDeContas();
		
	}
}
