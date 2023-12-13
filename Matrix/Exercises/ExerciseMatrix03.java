import java.util.Scanner;

public class ExerciseMatrix03 {

	public static void main(String[] args) {
		/*1. Create Java programs that create and display the following matrices below:
		c)
		1.9 2.5 10.0
		1.0 7.8 2.5
		3.5 2.2 4.7 
			*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter lines number");
		int lines = sc.nextInt();
		
		System.out.println("Enter columns number");
		int columns = sc.nextInt();
		
		double matrix [][] = new double[lines][columns];
		
		for(int i = 0; i< lines;i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = sc.nextDouble();
			}
			
		}
		
		for (int i = 0; i < lines; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.println(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}
