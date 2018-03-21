package br.com.javaBasico.tiposDados;

public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.nome = "João";
		p.mediaAluno(9,8);
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Moacir";
		double n = p2.mediaAluno(new double[] {7,8,5,3,4,6,7});
		System.out.println("Media turma = " + n);
		System.out.println("Media turma 2 = " + p2.mediaAluno(4,4,4,10));

	}

}
