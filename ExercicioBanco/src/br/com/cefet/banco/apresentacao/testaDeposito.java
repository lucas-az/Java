package br.com.cefet.banco.apresentacao;

import br.com.cefet.banco.negocio.Cliente;
import br.com.cefet.banco.negocio.Conta;
import br.com.cefet.banco.negocio.ContaCorrente;
import br.com.cefet.banco.negocio.ContaPoupanca;
import br.com.cefet.banco.negocio.ValorInvalidoException;

public class testaDeposito {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Nome", "Endereco", "cpf");
		Conta conta = new ContaPoupanca(cliente, 123);
		Conta conta1 = new ContaCorrente(cliente, 123);
		
		try {
			conta1.depositar(0);
			conta.depositar(-1);
			conta.depositar(0);
		}catch(ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
