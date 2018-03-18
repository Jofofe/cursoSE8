package br.com.javaBasico.tiposDados;

public class VariavelReferencia {
	
	int valor;
	
	public static void main(String... args) {
		int idade = 21; //21
		int idade2 = idade;
		
		idade += 5;
		
		System.out.println(idade);
		System.out.println(idade2);
		
		//////////////////////////////////
		
		VariavelReferencia referencia1 = new VariavelReferencia();
		referencia1.valor = 10; //BX10 valor 10
		VariavelReferencia referencia2 = referencia1; //BX10 valor 10
		
		referencia1.valor += 10;
		
		System.out.println(referencia1.valor); //BX10 --> 10
		System.out.println(referencia2.valor); //BX10 --> 10
		
	}

}
