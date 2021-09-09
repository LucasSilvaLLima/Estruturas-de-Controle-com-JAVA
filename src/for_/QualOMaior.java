package for_;

import java.util.Scanner;

public class QualOMaior {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		int numeroMaior = 0;
		
		System.out.println("Digite 10 número que eu mostro o maior no final!!\n");
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Digite um número o %d° número: ", i);
			numero = entrada.nextInt();
			if (numero > numeroMaior) {
				numeroMaior = numero;
			}
		}
		System.out.println("O maior número é o número " + numeroMaior);
		System.out.println("Fim.. 	;D");
		entrada.close();
	}
}
/**
	Algoritmpo que reconhece qual o maior valor inserido
*/