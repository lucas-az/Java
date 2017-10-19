package br.com.cefet.banco.apresentacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.cefet.banco.negocio.Cliente;
import br.com.cefet.banco.negocio.Conta;
import br.com.cefet.banco.negocio.ContaCorrente;

public class TestaOrdenacao {

	public static void main(String[] args) {
		Cliente titular = new Cliente("nome", "cpf", "endereco");
		Conta c1 = new ContaCorrente(titular, 123);
		Conta c2 = new ContaCorrente(titular, 456);
		Conta c3 = new ContaCorrente(titular, 789);
		
		List<Conta> contas = new ArrayList<Conta>();
		contas.add(c3);
		contas.add(c2);
		contas.add(c1);
		
		System.out.println("Antes do Collections.sort");
		
		for(int i = 0; i < contas.size(); i++) {
			System.out.println(contas.get(i).getNumero());
		}
		
		Collections.sort(contas);
		
		System.out.println("Depois do Collections.sort");
		
		for(int i = 0; i < contas.size(); i++) {
			System.out.println(contas.get(i).getNumero());
		}

	}

}
