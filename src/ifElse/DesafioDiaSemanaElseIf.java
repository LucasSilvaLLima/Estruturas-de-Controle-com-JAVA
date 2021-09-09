package ifElse;

import javax.swing.JOptionPane;

public class DesafioDiaSemanaElseIf {

	public static void main(String[] args) {

		String dia = "";
		while (!(dia.equals("sair"))) {
			dia = JOptionPane.showInputDialog("Insira o dia da semana:\n \"Ou sair para incerrar\"").toLowerCase();

			if (dia.equals("domingo")) {
				System.out.println(1);
			} else if (dia.equals("segunda")) {
				System.out.println(2);
			} else if (dia.equals("terça")) {
				System.out.println(3);
			} else if (dia.equals("quarta")) {
				System.out.println(4);
			} else if (dia.equals("quinta")) {
				System.out.println(5);
			} else if (dia.equals("sexta")) {
				System.out.println(6);
			} else if (dia.equals("sábado")) {
				System.out.println(7);
			} else if (!(dia.equals("sair"))) {
				System.out.println("Dia da semana Invalido");
			}

		}

		System.out.println("FIM");
	}
}
/**
 Algoritmo que lê a string do dia da semana e retorna um inteiro do dia respequitivo Utilizando else if
 */
