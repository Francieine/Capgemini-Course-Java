import java.util.Scanner;

public class ExerciseMatrix01 {

	public static void main(String[] args) {

		/*1. Create Java programs that create and display the following matrices below:
			a)
			a b c d e
			f g h i j
			l m n o p
			q r s t u
		*/
		
		Scanner sc = new Scanner(System.in);
		
		//input datas lines and columns typed for user
		System.out.println("Enter lines number");
		int lines = sc.nextInt();

		System.out.println("Enter columns number");
		int columns = sc.nextInt();
		
		//create a matrix with the sizes
		char matrix [][] = new char[lines][columns];
		
		System.out.println("Enter with caracters");
		
		for(int i = 0; i<lines; i++) { //full the matrix with datas insert for user
			for (int j = 0; j< columns; j++) {
				System.out.println("Matrix [" + i + "][" + j + "] :");
				matrix[i][j] = sc.next().charAt(0);
			}
		}
		
		// displaying matrix
		
		for(int i = 0; i < lines; i++) {
			for (int j = 0; j< columns; j++) {
				System.out.println(matrix[i][j] + " ");
				
			}
			System.out.println();
		}
		//close the program
		sc.close();
		
		
	}

}
