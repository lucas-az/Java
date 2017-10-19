package br.com.cefet.banco.apresentacao;

import br.com.cefet.banco.negocio.Banco;
import br.com.cefet.banco.negocio.Situacao;

public class TestaEnum {

	public static void main(String[] args) {
		Banco banco = new Banco("Bradesco", "Rua 1", "00000000001");
		
		banco.contratarFuncionario("João", "Rua 2", "11111111112", "TI", "Analista", 2300, Situacao.APOSENTADO);
		banco.contratarFuncionario("Lucas", "Rua 2", "11111111113", "TI", "Analista", 2800, Situacao.EMEXERCICIO);
		
		banco.mostrarTotalDeGastos();
		banco.imprimirListaDeFuncionarios();
	}

}
