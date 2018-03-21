package br.com.javaBasico.tiposDados;

public class StringQueMuda {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("11541827627");
		sb1.insert(3, '.');
		sb1.insert(7, ".");
		sb1.insert(11, '-');
		sb1.append(" este");
		sb1.append(" é meu cpf");
		System.out.println(sb1.toString());
		
		StringBuffer sb2 = new StringBuffer(60);
		System.out.println(sb2);
		
		StringBuffer sb3 = new StringBuffer(sb1);
		sb3.append(" meu nome");
		sb3.append(" é João");
		sb3.append('.');
		System.out.println(sb3);
		
		StringBuffer sb4 = new StringBuffer();
		sb4.append(sb3);
		System.out.println(sb4);
		sb4.delete(19, 50);
		System.out.println(sb4);
		
		StringBuilder sb5 = new StringBuilder();
		sb5.append("João");
		sb5.reverse();
		
		StringBuilder sb6 = new StringBuilder("Certificação Java");
		System.out.println(sb6.substring(0, 5));
		System.out.println(sb6.subSequence(0, 5));
	}
	

}
