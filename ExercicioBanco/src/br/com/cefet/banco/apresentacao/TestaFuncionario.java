package br.com.cefet.banco.apresentacao;

import br.com.cefet.banco.negocio.Funcionario;
import br.com.cefet.banco.negocio.Gerente;
import br.com.cefet.banco.negocio.Situacao;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Gerente("Alan", "233.856.456.34", "Rua ali perto", "RH", "Leva Cafezinho", 1800, Situacao.EMEXERCICIO, 123);
		Funcionario f2 = new Gerente("Douglas", "239.348.987.90", "Rua nao sei onde", "Admistrativo", "Auxiliar Administrativo", 2500, Situacao.EMEXERCICIO, 456);
		
		f2.aumentarSalario(0.10);
		
		f1.resumo();
		f2.resumo();

	}

}
