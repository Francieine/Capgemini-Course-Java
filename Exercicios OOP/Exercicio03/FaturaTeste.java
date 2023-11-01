/*Exercicio I - UNIVASF (Universidade Federal do Vale São Francisco*/

import java.util.Scanner;

public class FaturaTeste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		fatura fatura1 = new fatura("002","descrição", 12, 102.25);
		
		System.out.println("Gostaria de ver o total? (s/n)");
		char opcao = sc.next().charAt(0);
		if(opcao == 's') {
			System.out.println("Total da sua fatura: " + fatura1.getValorGastoFatura());
		}else {
			System.out.println("Sem descrição de fatura!");
		}
		
		System.out.println(fatura1);
		sc.close();
		
	}

}
