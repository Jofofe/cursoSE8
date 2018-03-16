package br.com.javaBasico.construtores;

public class Funcionario {
	String nome;
	static int idade;
	int cpf;
	
	public Funcionario(){
		this.nome = "João";
		this.idade = 25;
		this.cpf = 123456;
	}
	
	public Funcionario(String novoNome, int novaIdade, int novoCpf){
		this.nome = novoNome;
		this.idade = novaIdade;
		this.cpf = novoCpf;
	}
	
	public Funcionario(String novoNome){
		this.nome = novoNome;
		this.idade = 40;
		this.cpf = 456789;
	}
	
	
}
