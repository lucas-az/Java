package br.com.cefet.banco.apresentacao;

import br.com.cefet.banco.negocio.Banco;
import br.com.cefet.banco.negocio.Cliente;
import br.com.cefet.banco.negocio.Conta;
import br.com.cefet.banco.negocio.ContaCorrente;

public class TestaMap {

	public static void main(String[] args) {
		Banco banco = new Banco("nome", "endereco", "cnpj");
		banco.criarConta("nome", "cpf", "endereco", 123);
		banco.criarConta("Lucas", "cpf", "endereco", 567);
		
		System.out.println(banco.buscaPorNome("nome").getNumero());
		System.out.println(banco.buscaPorNome("Lucas").getNumero());

	}

}
