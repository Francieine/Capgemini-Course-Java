import java.util.Scanner;

public class ExerciseMatrix02 {

	public static void main(String[] args) {
		/*1. Create Java programs that create and display the following matrices below:
		b)
		19 25 100 99
		10 7 25 14
		35 2 47 74
		*/
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Typed the lines number");
		int lines = sc.nextInt();
		
		System.out.println("Typed the columns number");
		int columns = sc.nextInt();
		
		int matrix [][] = new int[lines][columns];
	
		System.out.println("Typed the numbers: ");
		for(int i = 0; i< lines; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.println("Matrix [" + i +"][" + j + "] :");
				matrix[i][j] = sc.nextInt();
			}
		}
		
		for ( int i = 0; i < lines; i++) {
			for (int j = 0; j< columns; j++) {
				System.out.println(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	
	sc.close();

	}

}
