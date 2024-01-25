package Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramPessoa {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		
		List<Pessoa> list = new ArrayList<>();
		
		
		System.out.println("Digite a quantidade de taxa de pagamento: ");
		int taxa = sc.nextInt();
		
		for(int i = 1; i<= taxa; i++){
			System.out.println("Taxa nº" + i + ":");
			
			
			System.out.println("Pessoa fisica ou empresa (p/e)? ");
			char opcao = sc.next().charAt(0);
			
			if(opcao == 'p') {
				
				System.out.println("Nome: ");
				String nome = sc.nextLine();
				
				sc.nextLine();
				System.out.println("Digite a renda anual: ");
				double rendaAnual = sc.nextDouble();
				
				System.out.println("Digite o gasto com a saude: ");
				double gastoSaude = sc.nextDouble();
				
				
				list.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
				
			}else if(opcao == 'e') {
				System.out.println("Digite o numero de funcionarios: ");
				int numeroFuncionarios = sc.nextInt();
				
				System.out.println("Nome: ");
				String nome = sc.nextLine();
				
				System.out.println("Digite a renda anual: ");
				double rendaAnual = sc.nextDouble();
				
				list.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
					
				}else {
					System.out.println("ERROR! Digite uma opcção valida!");

				}
				
			System.out.println();
			System.out.println("TAXAS DE PAGAMENTO: ");
			for (Pessoa pessoa : list) {
				System.out.println(pessoa.rendaAnual());
			}
				
			}
			sc.close();
		}

	}


