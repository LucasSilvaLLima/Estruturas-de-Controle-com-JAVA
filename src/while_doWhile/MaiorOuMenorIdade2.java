package while_doWhile;

import java.util.Scanner;

public class MaiorOuMenorIdade2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int idade;
		int qtdAlunos = 1;
		int maiorIdade = 0;
		int menorIdade = 0;
		
		while (qtdAlunos <= 10) {
			System.out.println("digite a idade do " + qtdAlunos + "� aluno.");
			idade = entrada.nextInt();
			qtdAlunos++;
			
			if (idade < 18) {
				menorIdade++;
			} else {
				maiorIdade++;
			}
		}
		System.out.println(menorIdade + " alunos s�o menores de idade");
		System.out.println(maiorIdade + " alunos s�o maiores de idade");

		entrada.close();
	}
}
/**
	Programa que l� a idade de 10 alunos. 
	Ao final informar quantos s�o menores de idade e quantos s�o maiores.
*/