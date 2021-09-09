package while_doWhile;

import javax.swing.JOptionPane;

public class Eleicao {
	public static void main(String[] args) {

		int i = 0;
		int pessoas = Integer.parseInt(JOptionPane.showInputDialog("Quantas Pessoas para a pesquisa ?"));
		double candA = 0;
		double candB = 0;
		double candC = 0;
		
		while (i < pessoas) {
			String voto = JOptionPane.showInputDialog("Seu voto é para qual candidato: (Digite a, b ou c)"
					+ "\nCandidato 'A'"
					+ "\nCandidato 'B'"
					+ "\nCandidato 'C'").trim();
			
			if (voto.equalsIgnoreCase("a")) {
				candA++;
			} else if(voto.equalsIgnoreCase("b")) {
				candB++;
			} else if(voto.equalsIgnoreCase("c")) {
				candC++;
			}
			
			i++;
		}
		 candA = candA / pessoas * 100;
		 candB = candB / pessoas * 100;
		 candC = candC / pessoas * 100;
		 
		JOptionPane.showMessageDialog(null,String.format("\nVotos Candidato 'A' = %.2f%%"
				+ "\nVotos Candidato 'B' = %.2f%%"
				+ "\nVotos Candidato 'C' = %.2f%%",candA, candB, candC)); 

 
		if(candA > candB && candA > candC) {
			JOptionPane.showMessageDialog(null, String.format("Candidato 'A' anhou com %.2f%% dos votos" ,candA));
		} else if(candB > candA && candB > candC) {
			JOptionPane.showMessageDialog(null, String.format("Candidato 'B' Ganhou com %.2f%% dos votos" ,candB));
		} else if(candC > candA && candC > candB){
			JOptionPane.showMessageDialog(null, String.format("Candidato 'C' Ganhou com %.2f%% dos votos" ,candC));
		} else {
			JOptionPane.showMessageDialog(null, "A eleição teve um empate :O");
		}
	} 
}
