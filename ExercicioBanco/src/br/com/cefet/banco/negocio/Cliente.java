package br.com.cefet.banco.negocio;

public class Cliente {
	
	private String nome;
	private String endereco;
	private final String cpf;
	
	public Cliente(String nome, String cpf, String endereco) {
		this.nome = nome;
		this.cpf = cpf;	
		this.endereco = endereco;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public String getCpf() {
		return this.cpf;
	}
}
