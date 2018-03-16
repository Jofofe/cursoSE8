package br.com.cursoSE8JavaBasico.interfaces;

public class Calculo implements ISoma {
	
	double soma;

	public static void main(String[] args) {
		Calculo c = new Calculo();
		c.exibeValordDePi();
		c.exibeSoma(8, 5);
	}

	@Override
	public void exibeValordDePi() {
		System.out.println(IValorDePi.PI);
	}

	@Override
	public void exibeSoma(double num1, double num2) {
		this.soma = num1 + num2;
		System.out.println(this.soma);
	}

}
