package br.com.javaBasico.breakContinue;

public class BreakContinue {
	
	public static void main(String argumentos[]) {
		int a = 0;
		
		while(a<10) {
			a++;
			if(a == 5) {
				continue;
			}else if(a == 7) {
				break;
			}else {
				System.out.println(a);
			}
		}
		
		System.out.println("Saiu do loop do while! Inicia o do for: ");
		
		int i;
		int j;
		
		externo:for(i=0; i < 5; i++) {
			for(j=0; j < 3; j++) {
				if(i*j == 9)break externo;
				System.out.println(i+" * "+j+" = "+i*j);
			}
		}
	}

}
