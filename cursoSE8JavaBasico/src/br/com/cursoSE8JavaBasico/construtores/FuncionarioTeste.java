package br.com.cursoSE8JavaBasico.construtores;

public class FuncionarioTeste {

	public static void main(String[] args) {
		Funcionario joao = new Funcionario();
		System.out.println(joao.nome);
		System.out.println(joao.idade);
		System.out.println(joao.cpf);
		
		Funcionario djhson = new Funcionario("Djhson", 32, 789123);
		System.out.println(djhson.nome);
		System.out.println(djhson.idade);
		System.out.println(djhson.cpf);
		
		Funcionario osmar = new Funcionario("Osmar");
		System.out.println(osmar.nome);
		System.out.println(osmar.idade);
		System.out.println(osmar.cpf);
		
	}

}
