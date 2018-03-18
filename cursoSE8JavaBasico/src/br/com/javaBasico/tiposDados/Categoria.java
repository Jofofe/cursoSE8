package br.com.javaBasico.tiposDados;

public class Categoria {
	
	//Categoria Numerica
	byte b = 127;
	short s = 32767;
	int i = 1154182767;
	long l = 4354534543534453645L;
	
	//Como representar o numero 267 em outras bases
	int ii = 0B100001011; // binario
	int iii = 0713; // octal
	int iiii = 0X10B; // hexadecimal
			
	//Pontos Flutuantes
	
	float f = 4_5;
	double d = 4_5;
	
	//Caracter (Tabela Unicode)
	char c = 65; //A
	char cc = 66; //B
	char ccc = 67; //C
	char cccc = 68; //D
	char sete = 7; // Pegadinha
	char car = 'c';
	
	//
	
	public static void main(String[] args) {
		Categoria c = new Categoria();
		System.out.println(c.b);
		System.out.println(c.s);
		System.out.println(c.i);
		System.out.println(c.l);
		System.out.println(c.ii);
		System.out.println(c.iii);
		System.out.println(c.iiii);
		System.out.println(c.c);
		System.out.println(c.cc);
		System.out.println(c.ccc);
		System.out.println(c.cccc);
		System.out.println(c.sete);
		System.out.println(c.car);
	}

}
