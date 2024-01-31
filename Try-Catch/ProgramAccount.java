package Account;

import java.util.Scanner;

public class ProgramAccount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		
		
		
			System.out.println("-------- Iforme os dados da conta -------");

			
			System.out.print("Digite o numero da conta");
			int numero = sc.nextInt();
			
			System.out.println("Digite o nome do titular: \n");
			String titular = sc.nextLine();
			
			System.out.println("Digite o valor do saldo inicial: \n");
			double saldo = sc.nextDouble();
			
			System.out.print("Digite o limite de saque: \n");
			double limiteSaque = sc.nextDouble();
			
			System.out.println();
			System.out.print("Digite o valor a ser sacado: \n");
			double saqueValor = sc.nextDouble();
			
			Account conta1 = new Account(numero,titular, saldo, limiteSaque);

			try {
			
				conta1.saque(saqueValor);
				System.out.println("Novo saldo: " + conta1.getSaldo());
				
				
			} 
			catch (BusinessException e){
				System.out.println(e.getMessage());
			}
			
		
		sc.close();
		
		
	}

}
