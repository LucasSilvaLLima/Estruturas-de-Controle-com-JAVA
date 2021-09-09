package for_;

import java.util.Scanner;

public class AnosBissexto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int bissexto = 0;
		for (int i = 1; i <= 2021; i++) {
			if (i % 4 == 0) {
				bissexto += 1;
			}
		}
		System.out.println("Do ano 1 até 2021 tiveram " + bissexto + " anos bissextos.");
		entrada.close();
	}
}
/**
	Programa que apresente todos os anos bissextos que ocorreram 
	desde o ano 1 até o ano de 2021.
*/