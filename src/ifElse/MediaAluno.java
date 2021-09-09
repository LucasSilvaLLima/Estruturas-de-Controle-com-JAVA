package ifElse;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite sua 1° nota: ");
		double nota1 = entrada.nextDouble();
		System.out.print("Digite sua 2° nota: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1+nota2)/2;
		
		if (media >= 7.0 ) {
			System.out.printf("A sua média foi %.2f você esta Aprovado",media);
		} else if (media >= 4 ) {
			System.out.printf("A sua média foi %.2f você esta em Recuperação",media);
		} else {
			System.out.printf("A sua média foi %.2f você foi Reprovado", media);
		}
		entrada.close();
	}
}
/**
	Calcula a media de um aluno e apresenta a cituação dele
*/ 