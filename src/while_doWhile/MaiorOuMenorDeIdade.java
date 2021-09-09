package while_doWhile;

import java.util.Scanner;

public class MaiorOuMenorDeIdade {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int continuar;
		do {
			System.out.print("Digite o ano atual: ");
			int ano = entrada.nextInt();
			System.out.print("\nDigite sua data de nascimento: ");
			int nascimento = entrada.nextInt();

			int idade = ano - nascimento;
			System.out.printf("\nVoc� tem %d anos. \n", idade);

			if (idade < 18) {
				System.out.println("Voc� � menor de idade.");
			} else {
				System.out.println("Voc� � maior de idade.");
			}

			System.out.println("Deseja Continuar ? \n(1 para sim) ou (2 para n�o).");
			continuar = entrada.nextInt();

		} while (continuar == 1 );
		System.out.println("Fim. ;)");
		entrada.close();
	}
}
/**
	Programa que leia o ano atual e o ano de nascimento de um usu�rio. 
	Calcule e apresente a sua idade, informando se � maior ou menor de idade. 
	Executar o programa at� que o usu�rio responda 2 � pergunta:
	Deseja continuar a execu��o? (1-para SIM ou 2-para N�O)

 */


