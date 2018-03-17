package br.com.javaBasico.modificadoresAcesso;

public class Carro {
	

    String nome;
	
	void exibeVelocidade() {
		System.out.println("Velocidade = 380Km/h, carro "+nome);
	}

	public static void main(String[] args) {
		Carro c = new Carro();
		c.nome = "Ferrari";
		c.exibeVelocidade();
	}

}
