package for_;

import java.util.Scanner;

public class VetorParOuImpar {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		int num;
		int par = 0;
		int impar = 0;
		int a[] = new int [10];
		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite o %d° valor: ", (i+1));
			num = entrada.nextInt();
			a[i] = num;
			if(num % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.print("Números Lidos = [");
		for (int i = 0; i < 10; i++) {
			System.out.print( a[i] + " ");
		}
		System.out.println("]");
		System.out.println("Números pares = "+par);
		System.out.println("Números impares = "+impar);
		entrada.close();
	}
}
/**
	Ler um vetor A com 10 números inteiros. 
	Ao final, apresentar a quantidade de número PARES 
	e a quantidade de números ÍMPARES lidos.

*/