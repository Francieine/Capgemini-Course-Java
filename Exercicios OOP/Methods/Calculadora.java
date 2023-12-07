
public class Calculadora {
	
	int numero1, numero2;
	char operator;
	
	public Calculadora(int numero1, int numero2, char operator) {
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.operator = operator;
	}
	
	public void Operador() {
		
		if(operator == '+') {
			System.out.println("Resultado da soma:" + (numero1 + numero2));
			
		}if(operator == '-') {
			System.out.println("Resultado da subtração:" + (numero1 - numero2));
			
		}if(operator == '*') {
			System.out.println("Resultado da subtração:" + (numero1 * numero2));
			
			
		}if(operator == '/') {
			System.out.println("Resultado da subtração:" + (numero1 / numero2));
			
		}		
		
	}
	
	
	
	
	

}
