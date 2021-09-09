package while_doWhile;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {
		
		double nota = 0;
		double numeroNota = 0;
		double somaNota = 0;
		
		while (nota != -1) {
			String n = JOptionPane.showInputDialog("Digite sua nota: \nOu -1 Para encerrar");
			nota = Double.parseDouble(n);
			
			if (nota >= 0 && nota <= 10) {
				somaNota += nota;
				numeroNota++;
			} else if (nota != -1) {
				System.out.println("VALOR INVALIDO");
			}
		}

		double media = somaNota/numeroNota;
		System.out.printf("A média das %.0f notas é %.1f \n",numeroNota,media);
		System.out.println("Fim");

	}
}
/**
	Programa que lê suas notas e diz quantas notas foram digitados e a sua média
*/