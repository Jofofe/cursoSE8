package br.com.javaBasico.metodosStaticos;

import javax.swing.JOptionPane;

public class Curso {
	static float n1,n2;
	static float media;
	
	static void insiraNota(){
		n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira Nota"));
		n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda Nota"));
	}
	
	static void calculaMedia(){
		media = (n1+n2) / 2;
	}
	
	static void exibiMedia(){
		JOptionPane.showMessageDialog(null, "A media é "+media);
	}
}
