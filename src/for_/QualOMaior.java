package for_;

import java.util.Scanner;

public class QualOMaior {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		int numeroMaior = 0;
		
		System.out.println("Digite 10 n�mero que eu mostro o maior no final!!\n");
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Digite um n�mero o %d� n�mero: ", i);
			numero = entrada.nextInt();
			if (numero > numeroMaior) {
				numeroMaior = numero;
			}
		}
		System.out.println("O maior n�mero � o n�mero " + numeroMaior);
		System.out.println("Fim.. 	;D");
		entrada.close();
	}
}
/**
	Algoritmpo que reconhece qual o maior valor inserido
*/