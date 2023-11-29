import java.util.Locale;
import java.util.Scanner;

public class Vector {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //Lendo valor do "n", onde "n" sao as posições dentro do vetor
		double[] vect = new double[n]; //declarando vetor "vect" e recebendo a sua instanciacao
		
		for(int i=0; i<n; i++) { //laço para percorrer as posicoes dentro do vetor
			vect[i] = sc.nextDouble(); // cada posição do vetor irá receber o que o usuario digitar

		}
		double sum = 0.0;
		
		for(int i=0; i<n; i++) {
			sum += vect[i];
		}
		double avg = sum / n;
		
		System.out.printf("Average Height: %.2f%n", avg);
		sc.close();
		
		
		
	}

}
