package for_;

import javax.swing.JOptionPane;

public class ParOuImparJOptionPane {

	public static void main(String[] args) {
		
		int numero;
		int par = 0;
		int impar = 0;
		
		for (int i = 1; i <= 10; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + i + "� valor"));
			
			if(numero % 2 == 0) {
				par++;
			}else {
				impar++;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Voc� digitou " + par + " pares e " + impar + " impares.");
	}
}
/**
	Programa que l� 10 numeros inteiros e diz quantos s�o pares e impares
*/