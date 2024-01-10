import java.util.Scanner;

public class ProgramCircle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Digite o valor do pi: ");
		double inptPi = sc.nextDouble();
		
		System.out.println("Digite o valor do raio: ");
		double inptRaio = sc.nextDouble();
		
		Circle c1 = new Circle(inptPi, inptRaio);
		
		System.out.println("Area do circulo: " + c1.calcularArea());
		System.out.println("Perimetro do circulo: " + c1.calcularPerimetro());
	}

}
