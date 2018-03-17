package br.com.javaBasico.importacaoEstatica;

import static java.lang.Math.*;
import static java.lang.System.out;

public class Matematica {
	
	static double raiz = 81;
	
	static void calculaRaiz () {
		System.out.println(sqrt(raiz));
	}
	
	static void calculaSeno() {
		out.println(sin(raiz));
	}
	
	static void exibeValorDePI () {
		out.println(PI);
	}
	
	public static void main(String... args) {
		calculaRaiz();
		exibeValorDePI();
	}

}
