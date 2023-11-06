/*Exemplo do Livro "Como Programar em Java" 10ed*/

import javax.swing.JOptionPane;

public class NameDialog {

	public static void main(String[] args) {
		
		//solicita o usuario para inserir o nome
		/*O showInput retorna uma String de caracteres digitado pelo usuario, armazenada na variavel "name"*/
		String name = JOptionPane.showInputDialog("What is your name? "); 
		
		//cria a mensagem; 
		String message = String.format("Welcome, %s, to Java Programming", name);
		
		//exibe mensagem na tela do usuario
		JOptionPane.showMessageDialog(null, message);

		
	}

}
