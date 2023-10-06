import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// Exercicio 03 Faça um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a formula: DIFERENCA = (A*B*C*D).
		
		
		Scanner sc = new Scanner (System.in);
		
		int A, B, C, D, produtoAeB, produtoCeD, calculoFinal;

		System.out.println("Digite o valor de 'A' ");
		A = sc.nextInt();
		
		System.out.println("Digite o valor de 'B' ");
		B = sc.nextInt();
		
		produtoAeB = A * B;
		
		System.out.println("Digite o valor de 'C' ");
		C = sc.nextInt();
		
		System.out.println("Digite o valor de 'D' ");
		D = sc.nextInt();
		
		produtoCeD = C * D;
		
		calculoFinal = produtoAeB - produtoCeD;
		
		System.out.println("DIFERENCA de A*B* - C*D, é: " + calculoFinal);
		
		sc.close();
	}

}
