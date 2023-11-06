
public class ChangingAccount {

	//1)atributos 
		private String name; //atributos armazenam dados para cada objeto da classe. São Iniciados como private
		private double balance; //
		//2) o Java requer a chamada de um construtor que é necessario para cada objeto que é desenvolvido
		public ChangingAccount(String name, double balance) {
			this.name = name;
			
			if(balance > 0.0) 
				this.balance = balance;
		}
		
		//metodo para deposito
		public void deposit(double depositAmount) { //se o valor/deposito for valido...
			if(depositAmount > 0.0)
				balance = balance + depositAmount; //...adiciona-se ao saldo
		}
		
		public void withdraw(double withdrawAmount) {
			if (withdrawAmount > 0.0) {
				balance = balance - withdrawAmount;

			}else {
				System.out.println("Withdrawl amount exceeded account balance");			}
		}
		
		//metodo para retornar o saldo da conta
		public double getBalance() {
			return balance;
		}
		
		//metodos são iniciados como publicos
		public void setName(String name) { //Define o nome no objeto; Aqui o metodo recebe o nome digitado e passa/envia o nome para o metodo como um argumento
			this.name= name; //armazena o nome
			}
		//3) getters e setters
		public String getName() { //metodo para recuperar o nome do objeto
			
			return name; //retorna valor do nome para o chamador (setName)
		}
}
