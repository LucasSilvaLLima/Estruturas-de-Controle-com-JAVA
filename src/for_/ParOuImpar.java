package for_;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira um n�mero entre 0 e 10\nDescruba se ele � par: ");
		int n = entrada.nextInt();

		if (n >= 0 && n <= 10) {
			if (n % 2 == 0) {
				System.out.printf("O n�mero %d � par",n);
			} else {
				System.out.printf("O n�mero %d n�o � par",n);
			}
		} else {
			System.out.println("N�mero Invalido");
		}

		entrada.close();
	}
}
/**
	Programa que l� um valor entre 0 e 10 e diz se ele � par ou impar.
*/