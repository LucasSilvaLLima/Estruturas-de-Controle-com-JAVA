package for_;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira um número entre 0 e 10\nDescruba se ele é par: ");
		int n = entrada.nextInt();

		if (n >= 0 && n <= 10) {
			if (n % 2 == 0) {
				System.out.printf("O número %d é par",n);
			} else {
				System.out.printf("O número %d não é par",n);
			}
		} else {
			System.out.println("Número Invalido");
		}

		entrada.close();
	}
}
/**
	Programa que lê um valor entre 0 e 10 e diz se ele é par ou impar.
*/