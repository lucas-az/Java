package br.com.cefet.banco.negocio;

public class Caixa extends Funcionario{
	private int numeroGuiche;
	
	public Caixa(String nome, String cpf, String endereco, String departamento, String cargo, double salario, Situacao estado) {
		super(nome, cpf, endereco, departamento, cargo, salario, estado);
	}

	public int getNumeroGuiche() {
		return numeroGuiche;
	}

	public void setNumeroGuiche(int numeroGuiche) {
		this.numeroGuiche = numeroGuiche;
	}
	
	public double getBonificacao() {
		return this.getSalario() * 0.10;
	}
	
}
