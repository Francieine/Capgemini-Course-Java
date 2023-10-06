import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// 1) Write a program to read two integer values, and then display the sum of these numbers on the screen with an explanatory message
		
		Scanner sc = new Scanner (System.in);
		
		int num1, num2, resultado;
		
		System.out.println("Digite o primeiro nº: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite o segundo nº: ");
		num2 = sc.nextInt();
		
		resultado  = num1 + num2;
		
		System.out.println("Soma: " + resultado);
		
		sc.close();
		
	}

}
