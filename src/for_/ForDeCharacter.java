package for_;

import java.util.Scanner;

public class ForDeCharacter {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a palavra: ");
		String palavra = entrada.nextLine();
		
		char letra[] = palavra.toCharArray();
		
		for (int i = 0; i < letra.length; i++) {
			System.out.println(letra[i]);
		}
		entrada.close();
	}
}
/**
	Programa que lê uma string e apresenta cada character na ordem
*/ 