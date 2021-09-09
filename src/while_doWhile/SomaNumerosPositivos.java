package while_doWhile;

import java.util.Scanner;

public class SomaNumerosPositivos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		int contador = 0;
		System.out.println("Digite números positivos para ver a soma deles\nOu negativos para encerrar o programa\n");
		
		do {
			System.out.print("Insira o número: ");
			numero = entrada.nextInt();
			if (numero > 0) {
				contador+= numero;
			}
			
			System.out.println("A soma dos números é " + contador);
			
		} while (!(numero < 0));
		System.out.println("Fim");
		entrada.close();
	}
}
/**
	Digite Números positivos para ver a soma de todos eles, ou negativo para encerrar o programa
*/