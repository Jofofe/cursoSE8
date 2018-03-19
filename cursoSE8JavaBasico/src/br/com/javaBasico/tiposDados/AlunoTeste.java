package br.com.javaBasico.tiposDados;

public class AlunoTeste {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		a2.nome = "João";
		a1.c1 = a2;
		a2 = new Aluno();
		a2.nome = "Pedro";
		a1.c2 = a2;
		a2 = null;
		
		if(15>10){
			Aluno b = new Aluno();
		}
		Aluno c;
		for(int i=0;i<10;i++){
			c = new Aluno();
		}
		
		System.out.println("Objeto = "+Aluno.contador);
		System.out.println(a1.c1.nome);
		System.out.println(a1.c2.nome);
	}

}
