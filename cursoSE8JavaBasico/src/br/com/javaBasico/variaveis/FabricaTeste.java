package br.com.javaBasico.variaveis;

public class FabricaTeste {
	
	public static void main(String[] args){
		
		Fabrica fabrica1 = new Fabrica();
		fabrica1.fabricarCarro();
		fabrica1.fabricarCarro();
		fabrica1.fabricarCarro();
		System.out.println("Carros fabrica 1: "+ fabrica1.carro);
		
		Fabrica fabrica2 = new Fabrica();
		fabrica2.fabricarCarro();
		fabrica2.fabricarCarro();
		System.out.println("Carros fabrica 2: "+ fabrica2.carro);
		
		System.out.println("Total: "+ Fabrica.total);
		
	}

}
