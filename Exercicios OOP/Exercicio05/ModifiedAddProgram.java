/* 1º Exercicio sobre GUI, baseado no Livro "Como Programar em Java" 10ed*/

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ModifiedAddProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String strNum1, strNum2;
		int number1, number2;
		int sum;
		
		strNum1 = JOptionPane.showInputDialog("Type the first number: "); //datas inputing
		strNum2 = JOptionPane.showInputDialog("Type the second number: ");
		
		number1 = Integer.parseInt(strNum1); //casting the String user's insert to int type for calcs
		number2 = Integer.parseInt(strNum2);
		
		sum = number1 + number2; //data processing
		
		JOptionPane.showMessageDialog(null, sum); //showing the result
		
		input.close();

	}

}
