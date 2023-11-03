/*Exercicio baseado no Livro "Como Programar em Java" 10ed*/

/*Criando e manipulando um objeto Account*/
import java.util.Scanner;

public class AccountTest { //classe driver, ou classe condutora do programa. Orienta o programa/objeto, indicando o que deve se fazer ao chamar seus metodos
	

	public static void main(String[] args) { 
		
		
		//cria um novo objeto Account e atribui a myAccount
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("Jonh Blue", -7.53);// o argumento entre "" é passado para o construtor do objeto Account e é usado apra iniciar o atributo name
		
		//exibe saldo inicial de cada objeto obj+ meth
		System.out.printf("%s balance: $%.2f %n" , account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f %n" , account2.getName(), account2.getBalance());
		
		Scanner input = new Scanner(System.in); //entrada é feita a partir da janela de comando

		
		//Depositando valorer na conta 1
		System.out.print("Enter deposit amount for account1: "); //mensagem na tela
		double depositAmount = input.nextDouble(); // captura o que foi digitado no teclado 
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount); //adiciona o saldo de account1
		
		//exibindo os saldos das duas contas
			System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
			System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());
		
			//Depositando valorer na conta 2
			System.out.print("Enter deposit amount for account2: "); //mensagem na tela
			depositAmount = input.nextDouble(); // captura o que foi digitado no teclado 
			System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
			account2.deposit(depositAmount); //adiciona o saldo de account2
			//exibindo os saldos das duas contas
			System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
			System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());
		
		/* 	System.out.printf("Initial name is: %s%n%n", myAccount.getName()); //exibe o valor inicial do nome para o objeto myAccount

		 * Le e solicita o nome
		System.out.println("Please enter the name: ");
		String theName = input.nextLine(); //lê o nome digitado
		myAccount.setName(theName);//insere theName(o que se digitou) em myAccount
		System.out.println();
		
		System.out.printf("Name in object myAccount is: %n%s%n", myAccount.getName()); //exibe na tela o nome amarmazenado no objeto myAccount
		
		*/
		
		input.close();
	}

}
