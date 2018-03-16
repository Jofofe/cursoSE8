package br.com.javaBasico.metodoMain;

public class Conta {
	String cliente;
	double saldo;
	
	void exibeSaldo(){
		System.out.println(this.cliente + " saldo: " + this.saldo);
	}
	
	void saca(double valor){
		if(this.saldo > valor){
			this.saldo -= valor;
			System.out.println(this.cliente + " seu saque foi realizado com socesso");
		} else {
			System.out.println("Sem saldo!!!");
		}
		
	}
	
	void deposito(double valor){
		this.saldo += valor;
		System.out.println(this.cliente + " seu deposito foi realizado com socesso");
		
	}
	
	
	static public final void main(String[] args) {
		Conta c1 = new Conta();
		c1.cliente = "João";
		c1.saldo = 5000;
		c1.exibeSaldo();
		c1.saca(450);
		c1.exibeSaldo();
		c1.deposito(1000);
		c1.exibeSaldo();
	}
}
