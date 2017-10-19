package br.com.cefet.banco.negocio;

public abstract class Funcionario {
	
	private String nome;
	private String endereco;
	private final String cpf;
	private String departamento;
	private String cargo;
	private double salario;
	private int identificador;
	private static int totalFuncionarios;
	private Situacao estado;
	
	public Funcionario(String nome, String cpf, String endereco, String departamento, String cargo, double salario, Situacao estado) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.departamento = departamento;
		this.cargo = cargo;
		this.salario = salario;
		Funcionario.totalFuncionarios++;
		this.identificador = Funcionario.totalFuncionarios;
		this.estado = estado;
	}
	
	public Situacao getEstado() {
		return this.estado;
	}
	
	public int getIdentificador() {
		return this.identificador;
	}
	
	public static int getTotalFuncionarios() {
		return Funcionario.totalFuncionarios;
	}
	
	public void aumentarSalario(double percentual) {
		this.salario = this.salario + this.salario * percentual;
	}
	
	public void resumo() {
		System.out.println("--------------------------");
		System.out.println("Funcionario: " + this.nome);
		System.out.println("Endereco: " + this.endereco);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Identificador: " + this.identificador);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Cargo: " + this.cargo);
		System.out.println("Salário: R$ " + this.salario);
		System.out.println("Bonificação: " + this.getBonificacao());
		System.out.println("Situação: " + this.estado.toString());
		System.out.println("--------------------------");
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public abstract double getBonificacao();
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
}
