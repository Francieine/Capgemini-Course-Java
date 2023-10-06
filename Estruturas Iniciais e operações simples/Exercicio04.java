import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// Exercicio 04 Crie um programa que leia o numero de um funcionario, seu numero de horas trabalhadas,  valor que recebe por hora e calcula o salario desse funcionario. A seguir, mostre o numero e o salario do funcionario, com duas casas decimais.
		
	
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		double id,horasTrabalhadas, salario;
		double valorRebecePorHora = 5.50;
		
		System.out.println("Digite o id do funcionario:");
		id = sc.nextDouble();
		
		System.out.println("Digite a quantidade de horas trabalhadas pelo funcionario:");
		horasTrabalhadas = sc.nextDouble();
		
		salario = horasTrabalhadas * valorRebecePorHora;
		System.out.println("O numero do funcionario é:" + id + "E seu salário é no valor de %.2f: " + salario);

		sc.close();
		
	}

}
