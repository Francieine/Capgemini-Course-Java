package Application;

import Entities.enums.Menu;

public class ProgramEnum2 {

	public static void main(String[] args) {

		Menu menu = Menu.SALGADOS;
		
		if(menu == Menu.SALGADOS) {
			System.out.println("Coxinha, kibe, pão de queijo, empada");
		}
		
		for(Menu meuMenu: Menu.values()) {
			System.out.println("Opção de menu: "+ meuMenu);
		}
		
	}

}
