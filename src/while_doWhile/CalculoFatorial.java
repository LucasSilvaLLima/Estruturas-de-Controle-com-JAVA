package while_doWhile;

import java.util.Scanner;

public class CalculoFatorial {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um n�mero para obter o fatorial do mesmo.");
		int num = entrada.nextInt();
		int contador = 1;
		int fat = 1;
		
		if(num < 0) {
			System.out.println("Digite um N�mero positivo");
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
	Programa que calcule e apresente o fatorial de um n�mero inteiro apresentado pelo usu�rio.
		Obs.: O fatorial de um n�mero � obtido por meio do c�lculo:
			5! = 5*4*3*2*1 = 120
*/