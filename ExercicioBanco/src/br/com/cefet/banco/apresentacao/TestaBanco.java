package br.com.cefet.banco.apresentacao;

import br.com.cefet.banco.negocio.Banco;
import br.com.cefet.banco.negocio.Situacao;

public class TestaBanco {	

	public static void main(String[] args) {
		Banco meuBanco = new Banco("Banco do Alfredo", "Rua 0", "11111111110");
		
		meuBanco.contratarFuncionario("João", "Rua 1", "11111111111", "TI", "Programador", 1000, Situacao.EMEXERCICIO);
		meuBanco.contratarFuncionario("Maria", "Rua2", "11111111112", "TI", "Analista", 2000, Situacao.EMEXERCICIO);
		meuBanco.contratarFuncionario("José", "Rua 3", "11111111113", "TI", "Gerente", 4000, Situacao.APOSENTADO);
		
		meuBanco.criarConta("Carol da Silva", "11111111114", "Rua 4", 1000);
		meuBanco.criarConta("Pedro de Oliveira", "11111111115", "Rua 5", 2000);
		
		meuBanco.mostrarSaldoTotal();
		meuBanco.mostrarTotalDeGastos();
		
		meuBanco.demitirFuncionario("11111111111");
		meuBanco.excluirConta("11111111115");
		
		meuBanco.mostrarSaldoTotal();
		meuBanco.mostrarTotalDeGastos();
		
	}
}
