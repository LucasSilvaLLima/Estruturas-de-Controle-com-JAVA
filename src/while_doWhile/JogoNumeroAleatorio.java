/**
	JOGO SORTEA UM NÚMERO ENTRE 0 E 100 E CONTINUA PEDINDO 
	O PROXIMO NÚMERO ATE ACERTAR, DIGITE 0 PARA SAIR
 */
package while_doWhile;

import java.util.Random;
import java.util.Scanner;

public class JogoNumeroAleatorio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int continuar;
		int numeroSorteado;
		int tentativas;
		int numero;
		
		do {
			System.out.println("Jogo Sorteando número entre 0 e 100\n");
			Random numeroAleatorio = new Random();
			numeroSorteado = numeroAleatorio.nextInt(101);
			
			System.out.println("Começou o jogo: ");
			tentativas = 0;
			
			do {
				tentativas++;
				System.out.printf("Tentativa %d: ", tentativas);
				numero = entrada.nextInt();
				
				if (numero > numeroSorteado) {
					System.out.printf("O número sorteado é menor que %d\n\n", numero);
				} else if (numero < numeroSorteado) {
					System.out.printf("O numero sorteado é maior que %d\n\n",numero);
				} else {
					System.out.printf("##Você acertou o número sorteado era %d##\n##Acertou em %d tentativas##\n\n",numeroSorteado, tentativas);
				}	
			} while (numero != numeroSorteado);
			
			System.out.println("Digite 0 para sair ou qualquer número para continuar.");
			continuar = entrada.nextInt();
			
		} while (continuar != 0);
		System.out.println("FIM OBRIGADO POR JOGAR");
		entrada.close();
	}
}