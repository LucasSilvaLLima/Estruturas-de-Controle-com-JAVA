package while_doWhile;

import java.util.Scanner;

public class CalculoFatorial {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número para obter o fatorial do mesmo.");
		int num = entrada.nextInt();
		int contador = 1;
		int fat = 1;
		
		if(num < 0) {
			System.out.println("Digite um Número positivo");
		}else {			
			while (num >= contador ) {
				fat = fat * contador;
				contador++;
			}
			System.out.println(fat);
		}
		entrada.close();
	}
}
/**
	Programa que calcule e apresente o fatorial de um número inteiro apresentado pelo usuário.
		Obs.: O fatorial de um número é obtido por meio do cálculo:
			5! = 5*4*3*2*1 = 120
*/