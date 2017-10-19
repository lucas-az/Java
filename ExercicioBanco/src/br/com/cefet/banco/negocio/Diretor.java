package br.com.cefet.banco.negocio;

public class Diretor extends Funcionario implements Autenticavel {
	private int senha;
	
	public Diretor(String nome, String cpf, String endereco, String departamento, String cargo, double salario,
			Situacao estado, int senha) {
		super(nome, cpf, endereco, departamento, cargo, salario, estado);
		this.senha = senha;
	}

	public double getBonificacao() {
		return this.getSalario() * 0.20;
	}
	
	public boolean autenticar(int senha) {
		if(this.senha == senha)
			return true;
		else
			return false;
	}

}
