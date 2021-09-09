package while_doWhile;

public class CalcAlturaJoaoPedro {

	public static void main(String[] args) {
		
		double joao = 1.34;
		double pedro = 1.45;
		int ano = 0;
		while(joao <= pedro) {
			ano++;
			joao += 0.25;
			pedro += 0.2;
		}
		System.out.println("Altura João = "+ joao + "\nAltura Pedro = " + pedro 
				+ "\nAnos para João ser maior que Pedro é = " + ano);
	}
}
/**
	João tem 1,34m de altura e Pedro tem 1,45m. 
	João cresce 2,5cm por ano e Pedro cresce 2cm por ano. 
	Quantos anos irá demorar para João ficar mais alto que Pedro.
*/