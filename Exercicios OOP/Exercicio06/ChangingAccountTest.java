import java.util.Scanner;

public class ChangingAccountTest {

	public static void main(String[] args) {

		//cria um novo objeto Account e atribui a myAccount
		ChangingAccount account1 = new ChangingAccount("Jane Green", 50.00);
		ChangingAccount account2 = new ChangingAccount("Jonh Blue", -7.53);// o argumento entre "" é passado para o construtor do objeto Account e é usado apra iniciar o atributo name
		
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
			
			//Sacando valorer na conta 1
			System.out.println("Enter with the you will withdraw value for account1: ");
			double withdrawAmount = input.nextDouble();
			System.out.printf("%nadding %.2f to account1 balance%n%n", withdrawAmount);
			account1.withdraw(withdrawAmount);
			
			//exibindo os saldos das duas contas
			System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
			System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());
		
		input.close();

	}

}
