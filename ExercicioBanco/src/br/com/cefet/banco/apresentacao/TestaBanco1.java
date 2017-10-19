package br.com.cefet.banco.apresentacao;

import br.com.cefet.banco.negocio.Banco;
import br.com.cefet.banco.negocio.Situacao;

public class TestaBanco1 {

	public static void main(String[] args) {
		
		Banco meuBanco = new Banco("Meu Banco", "Rua 0", "11111111111");
		
		meuBanco.contratarFuncionario("Joao", "Rua 01", "11111111111", "TI", "Analista", 1000, Situacao.EMEXERCICIO);
		meuBanco.contratarFuncionario("Maria", "Rua 02", "22222222222", "TI", "Programador", 2000, Situacao.EMEXERCICIO);
		meuBanco.contratarFuncionario("José", "Rua 03", "33333333333", "TI", "Gerente", 4000, Situacao.EMFERIAS);
		
		System.err.println("Antes da demissão:");
		meuBanco.imprimirListaDeFuncionarios();
		
		meuBanco.demitirFuncionario(2);
		meuBanco.demitirFuncionario("11111111111");
		
		System.err.println("Após da demissão:");
		meuBanco.imprimirListaDeFuncionarios();

	}

}
