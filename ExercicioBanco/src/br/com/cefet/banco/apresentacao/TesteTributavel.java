package br.com.cefet.banco.apresentacao;

import br.com.cefet.banco.negocio.Cliente;
import br.com.cefet.banco.negocio.ContaCorrente;
import br.com.cefet.banco.negocio.SeguroDeVida;
import br.com.cefet.banco.negocio.Tributavel;
import br.com.cefet.banco.negocio.ValorInvalidoException;

public class TesteTributavel {

	public static void main(String[] args) throws ValorInvalidoException {
		Cliente c = new Cliente("Nome", "Endereco", "cpf");
		ContaCorrente cc = new ContaCorrente(c, 123);

		cc.depositar(100);
		System.out.println(cc.calcularTributos());
		
		SeguroDeVida sv =  new SeguroDeVida();
		System.out.println(sv.calcularTributos());
		
		Tributavel t = cc;
		System.out.println(t.calcularTributos());
	}

}
