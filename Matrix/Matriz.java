//Exercise Nelio Alves - Matrix

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // for input datas
		int [][] mat = new int [n][n]; // reference n
		
		for (int i = 0; i < n; i++) { // arround matrix line
			for(int j = 0; j < n; j++) { //arround matrix column
				mat[i][j] = sc.nextInt(); //read the input's typed for user
			}
		}
		
		System.out.println("Main diagonal: ");
		for (int i = 0; i<n; i++) {
			System.out.print(mat[i][i] + "");
		}
		
		
		int count = 0;
		
		for(int i = 0; i<n;i++) {
			for(int j=0; j<n; j++) {
				if(mat[i][j] < 0) {}
				count++;
				
			}
		}
	
		System.out.println("Negative numbers: "+ count);
		
		sc.close();
	}

}
