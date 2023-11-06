/*Exemplo do Livro "Como Programar em Java" 10ed*/

import javax.swing.JOptionPane; /*esse pacote javax.swing contem muitas classes que ajudam criar GUIs para Apps*/

public class Dialog1 {

	public static void main(String[] args) {
		/*"JOptionPane" é uma classe que fornece caixas de dialogo
		 * "showMessage" é o metodo chamado para exibir uma caixa de dialogo que contem a mensagem
		 * se o primeiro argumento do metodo for "null" fará aparecer a janela no centro da tela; O segundo
		 * argumento é a String que será exibida na tela*/
		
		JOptionPane.showMessageDialog(null,"Welcome to Java!");//exibe janelas ao usuario que contem uma mensagem
		
	}

}
