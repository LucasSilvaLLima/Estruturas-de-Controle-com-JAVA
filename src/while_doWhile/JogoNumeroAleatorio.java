/**
	JOGO SORTEA UM N�MERO ENTRE 0 E 100 E CONTINUA PEDINDO 
	O PROXIMO N�MERO ATE ACERTAR, DIGITE 0 PARA SAIR
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
			System.out.println("Jogo Sorteando n�mero entre 0 e 100\n");
			Random numeroAleatorio = new Random();
			numeroSorteado = numeroAleatorio.nextInt(101);
			
			System.out.println("Come�ou o jogo: ");
			tentativas = 0;
			
			do {
				tentativas++;
				System.out.printf("Tentativa %d: ", tentativas);
				numero = entrada.nextInt();
				
				if (numero > numeroSorteado) {
					System.out.printf("O n�mero sorteado � menor que %d\n\n", numero);
				} else if (numero < numeroSorteado) {
					System.out.printf("O numero sorteado � maior que %d\n\n",numero);
				} else {
					System.out.printf("##Voc� acertou o n�mero sorteado era %d##\n##Acertou em %d tentativas##\n\n",numeroSorteado, tentativas);
				}	
			} while (numero != numeroSorteado);
			
			System.out.println("Digite 0 para sair ou qualquer n�mero para continuar.");
			continuar = entrada.nextInt();
			
		} while (continuar != 0);
		System.out.println("FIM OBRIGADO POR JOGAR");
		entrada.close();
	}
}