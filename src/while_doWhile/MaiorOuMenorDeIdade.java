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
			System.out.printf("\nVocê tem %d anos. \n", idade);

			if (idade < 18) {
				System.out.println("Você é menor de idade.");
			} else {
				System.out.println("Você é maior de idade.");
			}

			System.out.println("Deseja Continuar ? \n(1 para sim) ou (2 para não).");
			continuar = entrada.nextInt();

		} while (continuar == 1 );
		System.out.println("Fim. ;)");
		entrada.close();
	}
}
/**
	Programa que leia o ano atual e o ano de nascimento de um usuário. 
	Calcule e apresente a sua idade, informando se é maior ou menor de idade. 
	Executar o programa até que o usuário responda 2 à pergunta:
	Deseja continuar a execução? (1-para SIM ou 2-para NÃO)

 */


