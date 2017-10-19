package br.com.cefet.banco.apresentacao;

import br.com.cefet.banco.negocio.Cliente;
import br.com.cefet.banco.negocio.ContaCorrente;
import br.com.cefet.banco.negocio.ContaPoupanca;
import br.com.cefet.banco.negocio.GerenciadorDeImpostoDeRenda;
import br.com.cefet.banco.negocio.SeguroDeVida;

public class TestaGerenciador {

	public static void main(String[] args) {
		Cliente c = new Cliente("Nome", "Endereco", "cpf");
		GerenciadorDeImpostoDeRenda gr = new GerenciadorDeImpostoDeRenda();
		
		ContaCorrente cc = new ContaCorrente(c, 123);
		ContaCorrente cc1 = new ContaCorrente(c, 123);
		ContaPoupanca cc2 = new ContaPoupanca(c, 123);
		SeguroDeVida sv = new  SeguroDeVida();
		SeguroDeVida sv1 = new  SeguroDeVida();
		SeguroDeVida sv2 = new  SeguroDeVida();
		
		cc.depositar(2000);
		
		gr.adiciona(cc);
		gr.adiciona(cc1);
		gr.adiciona(sv);
		gr.adiciona(sv1);
		gr.adiciona(sv2);
		
		System.out.println(gr.getTotal());
	}

}
