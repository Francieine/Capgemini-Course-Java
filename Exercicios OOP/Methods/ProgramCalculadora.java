import java.util.Scanner;

public class ProgramCalculadora {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite qual operação irá realizar (+, -, *, ou /");
		char op = sc.next().charAt(0);
		
		System.out.println("Digite o primeiro numero: ");
		int num1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int num2 = sc.nextInt();
		
		
		Calculadora calculadora = new Calculadora(num1, num2, op);
		
		System.out.println("Calcule: ");
		calculadora.Operador();
		
		
		sc.close();
		
		
		
	}

}
