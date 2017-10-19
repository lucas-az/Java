package br.com.cefet.banco.apresentacao;

import br.com.cefet.banco.negocio.Cliente;
import br.com.cefet.banco.negocio.Conta;
import br.com.cefet.banco.negocio.ContaCorrente;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente c = new Cliente("Lucas Azevedo", "1234567891", "Rua Magali Aldalberto Cunha, nº 12 - Carmo");
		
		Conta contaC = new ContaCorrente(c, 345789);
		
		contaC.depositar(2000);
		contaC.sacar(300);
		
		System.out.println("Saldo de " + contaC.getTitular().getNome() + ": " + contaC.getSaldo());
	}
}
