package ifElse;


import java.util.Scanner;

public class AnoBissesto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Programa que mostra se o ano é bissesto \nEm que ano estamos ? ");
		int ano  = entrada.nextInt();
		
		int bissesto = ano % 4;
		if (bissesto == 0) {
				System.out.println("O ano é bissesto");
			} else {
				System.out.println("O ano não é bissesto");
			}
		
		System.out.println("Fim");
		entrada.close();
	}
}
/**
 * Programa que lê o ano e diz se é bissesto  
 **/
