package br.com.cefet.banco.negocio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {
	
	private String nome;
	private String endereco;
	private String cnpj;
	private List<Conta> contas; 
	private List<Funcionario> funcionarios;
	private Map<String, Conta> mapa;
	
	public Banco(String nome, String endereco, String cnpj) {
		this.nome = nome;
		this.endereco = endereco;
		this.cnpj = cnpj;
		this.contas = new ArrayList<Conta>();
		this.funcionarios = new ArrayList<Funcionario>();
		this.mapa = new HashMap<String, Conta>();
	}
	
	public Conta buscaPorNome(String nome) {
		return mapa.get(nome);
	}
	
	public void atualizarContas(double selic) {
		for(int i = 0; i < this.contas.size(); i++) {
			if(this.contas.get(i) != null)
				contas.get(i).atualiza(selic);
		}
	}
	
	public void imprimirRelatorioDeContas() {
		for(Conta c : this.contas) {
			if(c != null)
				c.imprimirResumo();
		}
	}
	
	public boolean adicionarConta(Conta conta) {
		if(this.contas.add(conta)) {
			this.mapa.put(conta.getTitular().getNome(), conta);
			return true;
		}
		else
			return false;
	}
	
	public void imprimirListaDeFuncionarios() {
		for(int i = 0; i < this.funcionarios.size(); i++) {
			this.funcionarios.get(i).resumo();
		}
	}
	
	public boolean criarConta(String nome, String cpf, String endereco, int numero) {
		Cliente titular = new Cliente(nome, cpf, endereco);
		Conta novo = new ContaCorrente(titular, numero);
		return this.adicionarConta(novo);
	}
	
	public boolean excluirConta(String cpf) {
		
		for(int i = 0; i < this.contas.size(); i++) {
			if(this.contas.get(i).getTitular().getCpf() == cpf) {
				this.contas.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public boolean contratarFuncionario(String nome, String endereco, String cpf, String departamento, String cargo, double salario, Situacao estado) {
		
		Funcionario novo = new Gerente(nome, cpf, endereco, departamento, cargo, salario, estado);
		
		if(this.funcionarios.add(novo))
			return true;
		else
			return false;
	}
	
	public boolean demitirFuncionario(String cpf) {
		
		for(int i = 0; i < this.funcionarios.size(); i++) {
			if(this.funcionarios.get(i).getCpf() == cpf) {
				this.funcionarios.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public boolean demitirFuncionario(int id) {
		
		for(int i = 0; i < this.funcionarios.size(); i++) {
			if(this.funcionarios.get(i).getIdentificador() == id) {
				this.funcionarios.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public void mostrarSaldoTotal() {
		
		double totalSaldo = 0;
		
		for(int i = 0; i < this.contas.size(); i++) {
			totalSaldo += this.contas.get(i).getSaldo();
		}
		
		System.out.println("Saldo total: R$ " + totalSaldo);
	}
	
	public void mostrarTotalDeGastos() {
		
		double totalGastos = 0;
		
		for(int i = 0; i < this.funcionarios.size(); i++) {
			if(this.funcionarios.get(i).getEstado() == Situacao.EMEXERCICIO)
				totalGastos += this.funcionarios.get(i).getSalario();
		}
		
		System.out.println("Total de gastos: R$ " + totalGastos);
	}
}
