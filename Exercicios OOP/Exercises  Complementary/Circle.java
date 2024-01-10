//1) Exercicio para logica OOP
//Crie uma classe Circulo que represente um círculo. 
//Inclua métodos para calcular a área e o perímetro do círculo.

public class Circle {

	public  double pi;
	public double raio;
	
	public Circle() {
		
	}

	public Circle(double pi, double raio) {
		this.pi = pi;
		this.raio = raio;
	}
	
	
	public double calcularArea() {
		return pi * (raio * 2); //melhorar essa parte do codigo ver Math.pow
	}
	
	public double calcularPerimetro() {
		return raio * (pi * 2);
	}
	

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	


		
}
