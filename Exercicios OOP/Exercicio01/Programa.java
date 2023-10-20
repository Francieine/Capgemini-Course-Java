package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Conta;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Conta conta;

		System.out.println("Digite o numero da conta: "); /*Entrada de dados - numero conta*/
		int numeroConta = sc.nextInt();
		
		System.out.println("Digite o nome do titular:");/*Entrada de dados - nome titular*/
		sc.nextLine();
		String nomeTitular = sc.nextLine();
		
		System.out.println("Existe algum deposito inicial (s/n)?"); /*Entrada de dados - escolher opção*/
		char resposta = sc.next().charAt(0);
		
		if (resposta == 's') {
			System.out.println("Digite o valor do deposito");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numeroConta, nomeTitular, depositoInicial);
		} else {
			conta = new Conta(numeroConta, nomeTitular);
		}

		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);

		System.out.println();
		System.out.println("Informe o valor de deposito: ");
		double valorDeposito = sc.nextDouble();
		conta.depositar(valorDeposito);
		System.out.println(conta);

		System.out.println();
		System.out.println("Informe o valor de saque: ");
		double valorSaque = sc.nextDouble();
		
		conta.depositar(valorSaque);
		System.out.println("Dados atualizados: ");
		System.out.println(conta);

		sc.close();

	}

}
