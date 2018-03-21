package br.com.javaBasico.tiposDados;

public class Variavel {
	
	int ano;
	byte b;
	long l;
	float f;
	double d;
	char c;
	boolean boo;
	Carro carro;
	String nome;
	
	public static void main(String[] args) {
		Variavel v = new Variavel();
		System.out.println(v.ano);
		System.out.println(v.b);
		System.out.println(v.l);
		System.out.println(v.f);
		System.out.println(v.d);
		System.out.println("Char default: "+ (v.c == 0));
		System.out.println(v.boo);
		System.out.println(v.carro);
		System.out.println(v.nome);
	}

}
