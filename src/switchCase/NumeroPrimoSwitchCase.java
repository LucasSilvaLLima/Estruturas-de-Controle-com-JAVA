package switchCase;

import java.util.Scanner;

public class NumeroPrimoSwitchCase {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.print("Digite um número para saber se ele é primo: ");
		 int num = entrada.nextInt();
		 int contador = 0;

		 for (int i = 2; i < num; i++) {
			 if (num % i == 0) {
				 contador++;
			 }
		 }
		 
		 switch (contador) {
		case 0:
			System.out.println(num +" é primo");
			break;

		default:
			System.out.println(num + " não é primo");
			break;
		}
		 
		 entrada.close();
	}
}
