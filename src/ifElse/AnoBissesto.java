package ifElse;


import java.util.Scanner;

public class AnoBissesto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Programa que mostra se o ano � bissesto \nEm que ano estamos ? ");
		int ano  = entrada.nextInt();
		
		int bissesto = ano % 4;
		if (bissesto == 0) {
				System.out.println("O ano � bissesto");
			} else {
				System.out.println("O ano n�o � bissesto");
			}
		
		System.out.println("Fim");
		entrada.close();
	}
}
/**
 * Programa que l� o ano e diz se � bissesto  
 **/
