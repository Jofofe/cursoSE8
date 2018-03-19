package br.com.javaBasico.tiposDados;

public class Carro {
	private String modelo;
	private int ano;
	
	Carro(){
		ano = 2015;
	}
	void modelo(){
		modelo = "Ferrari Enzo";
		System.out.println(modelo);
	}
	void setCarro(String modelo){
		modelo = modelo;
		System.out.println(modelo);
		System.out.println(this.modelo);
	}
	
	public static void main(String[] args) {
		Carro c = new Carro();
		c.setCarro("Palio");
		c.modelo();
		c.modelo = "Captiva";
		System.out.println(c.modelo);
		c.ano = 2010;
		System.out.println(c.ano);
	}

}
