package Modelos;

import java.util.Scanner;

public class ProgramPessoa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String pessoaNome = sc.nextLine();
		
		System.out.println("Digite sua idade: ");
		int pessoaIdade= sc.nextInt();
		
		Pessoa pessoa = new Pessoa(pessoaNome, pessoaIdade);
		
		System.out.println("Informações da pessoa: ");
		pessoa.exibirInformacoes();
		
		
		sc.close();
	}

}
