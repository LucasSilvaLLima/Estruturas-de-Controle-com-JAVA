package switchCase;

import javax.swing.JOptionPane;

public class RodizioCarro {

	public static void main(String[] args) {

		int placa = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Descubra qual dia o rodizio do seu carro\nDigite o fanal da sua placa"));

		switch (placa) {

		case 0, 1:
			JOptionPane.showMessageDialog(null, "O seu rodizio é na Segunda-Feira");
			break;
		case 2, 3:
			JOptionPane.showMessageDialog(null, "O seu rodizio é na Terça-Feira");
			break;
		case 4, 5:
			JOptionPane.showMessageDialog(null, "O seu rodizio é na Quarta-Feira");
			break;
		case 6, 7:
			JOptionPane.showMessageDialog(null, "O seu rodizio é na Quinta-Feira");
			break;
		case 8,9:
			JOptionPane.showMessageDialog(null, "O seu rodizio é na Sexta-Feira");
			break;
		default:
			throw new IllegalArgumentException("Final de placa inexistente: " + placa + "\nInsira um valor entre 0 e 9");
		}
	}
}
/**
	Programa que lê o final da sua placa e diz o dia do seu rodizio
*/