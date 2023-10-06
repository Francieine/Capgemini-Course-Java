import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// Exercicio 02 - Faça um programa para ler o valor de um circulo e depois mostrar o valor da area deste circulo com quatro casas decimais
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double area, raio;
		double pi = 13.14159;
		
		System.out.println("Digite o valor do raio do circulo: "); //entrada de dados
		raio = sc.nextDouble();
		
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("A area do circulo é: %.4f", area);
		
		sc.close();
		
	}

}
