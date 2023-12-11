import java.util.Scanner;

public class MatrixExercise01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //input size matrix
		int [][] mat = new int[n][n]; 
		
		for (int i = 0; i < n; i++) { //reading lines
			for(int j = 0; j<n ; j++) { //reading columns
				mat[i][j] = sc.nextInt(); //Reading datas user's typed
				
			}
			
			
		}
		
		int k = sc.nextInt(); // for control number input
		
		for(int i = 0; i < k; k++) {
			for(int j = 0; j< k; j++) {
				if(mat[i][j] == k) {
					System.out.println("Postion: " + i + "" + j); // screen the line and column where number are
				}if(j > 0) {
					System.out.println("left: " + mat[i][j-1]);
				}if(i > 0) {
					System.out.println("up: " + mat[i-1][j]);

				}if(j < mat[i].length-1) {
					System.out.println("right: " + mat[i][j+1]);

				}if(j < mat[i].length-1) {
					System.out.println("down: " + mat[i+1][j]);
				
				
			}
		}
		
	}
	
		sc.close();
	}
}
