package for_;

import java.util.Scanner;

public class NumeroPrimoComFor {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número para saber se ele é primo: ");
		int n = entrada.nextInt();
		int contador = 0;
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				contador++;
			}
		}
		if (contador == 0) {
			System.out.printf("O número %d é primo",n);
		} else {
			System.out.printf("O número %d não é primo", n);
		}
		
		entrada.close();
	}
}
/**
	Lê um valor inteiro e diz se é primo.
*/