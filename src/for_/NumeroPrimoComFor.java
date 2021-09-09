package for_;

import java.util.Scanner;

public class NumeroPrimoComFor {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um n�mero para saber se ele � primo: ");
		int n = entrada.nextInt();
		int contador = 0;
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				contador++;
			}
		}
		if (contador == 0) {
			System.out.printf("O n�mero %d � primo",n);
		} else {
			System.out.printf("O n�mero %d n�o � primo", n);
		}
		
		entrada.close();
	}
}
/**
	L� um valor inteiro e diz se � primo.
*/