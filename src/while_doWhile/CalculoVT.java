package while_doWhile;

import java.util.Scanner;

public class CalculoVT {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double salarioBruto;
		double salarioComDesconto;
		double descontoVt;
		do {
			System.out.print("Insira seu s�lario bruto: \n(Ou 0 para encerrar)");
			salarioBruto = entrada.nextDouble();

			if (salarioBruto == 0) {
				System.out.println("Fim");
			} else {

				salarioComDesconto = salarioBruto * (1 - 0.06);
				descontoVt = salarioBruto - salarioComDesconto;

				System.out.printf("O desconto do vale transporte � de %.2f\n", descontoVt);
			}
		} while (salarioBruto != 0);
 
		entrada.close();
	}
}
/**
 * Programa que l� o seu sal�rio Bruto e calcula o valor seu vale tranporte.
*/
