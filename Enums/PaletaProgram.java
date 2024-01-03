package Application;

import Entities.enums.Paleta;

public class PaletaProgram {

	public static void main(String[] args) {

		
		Paleta cor = Paleta.VERDE;
		
		switch (cor) {
		case AZUL:
		case AMARELO:
		case VERMELHO:
			System.out.println("Cor primaria");
			break;
			
		case VERDE:
		case CINZA:
		case LILAS:
		System.out.println("Cor secundaria");
			break;
		}
	}

}
