package Application;

import java.util.Scanner;

import Entities.Rent;

public class ProgramRent {

	public static void main(String[] args) {
		// LOGICA PARA LER OS OBJETOS
		
		Scanner sc = new Scanner(System.in);
		
		//Criando um vetor de tamanho 10 onde cada elemento de dentro do vetor será um rent (aluguel)
		Rent[] vect = new Rent[10]; //Obs.: as informações de nome e email serão armazenadas no vetor "vect"
		
		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt(); //entrada da quantidade de quartos para alugar
		
		
		for(int i = 1; i <=n; i++) {
			System.out.println("Rent #" + i + ":"); // irá mostrar cada rent feito pela pessoa
			
			System.out.println("Name: ");
			sc.nextLine(); //quebra de linha
			String name  = sc.nextLine(); //Entrada de nome
			
			System.out.println("Email: ");
			String email  = sc.nextLine(); //Entrada de email
			
			System.out.println("Room : ");
			int roomNumber = sc.nextInt(); //Entrada do numero de quartos
			
			vect[roomNumber] = new Rent(name, email);  //instanciando o objeto vetor, recebe o valor que o usuario digitou e armazena na posição
		
			
			}
			
		//Imprimindo as informações
		
		System.out.println();//quebra de linha
		System.out.println("Busy rooms: ");
		for (int i = 0; i< 10; i++) {
			if (vect[i] !=null) { // se o vetor for diferente de null imprima a informação
				System.out.println(i + ":" + vect[i]); // ira imprimir o numero do quarto e o nome das pessoas que alugaram ele
			}

		}
		sc.close();
		
		
	}

}
