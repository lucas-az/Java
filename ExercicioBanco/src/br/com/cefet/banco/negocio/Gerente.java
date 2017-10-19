package br.com.cefet.banco.negocio;

public class Gerente extends Funcionario implements Autenticavel{

	private int senha;
	private static int totalGerentes;
	
	public Gerente(String nome, String cpf, String endereco, String departamento, String cargo, double salario, 
			Situacao estado, int senha) {
		super(nome, cpf, endereco, departamento, cargo, salario, estado);
		this.senha = senha;
		Gerente.totalGerentes++;
	}
	
	public Gerente(String nome, String cpf, String endereco, String departamento, String cargo, double salario,
			Situacao estado) {
		super(nome, cpf, endereco, departamento, cargo, salario, estado);
	}



	public boolean autenticar(int senha) {
		if(this.senha == senha)
			return true;
		else
			return false;
	}
	
	public static int getTotalGerentes() {
		return Gerente.totalGerentes;
	}
	
	public double getBonificacao() {
		return this.getSalario() * 0.20;
	}

}
