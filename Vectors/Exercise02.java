package Application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVect2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int n;
		int avg, sum;
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("How many numbers you will type?"); //display in the screen the ask
		
		 n = sc.nextInt(); //reading number positions typing for user - input datas
		int [] vector = new int [n]; //making the vector and storage the value typed for user
		
		for(int i=0; i< n; i++) { //loop to cycle through the positions within the vector
			System.out.println("Input values: ");
			vector[i] = sc.nextInt(); // each position of the vector will receive the 04 values chosen by the user, who will type on the keyboard
		}
		sum = 0;
		
		for(int i= 0 ; i<n; i++) { 
			
			sum = sum +  vector[i]; //calculating value sum
		}
		
		avg = sum/n; //calculating value avarege
		
		System.out.println("Values: ");
		
		for (int i = 0; i < n; i++) { 
			System.out.printf("%.1f", vector[i]); //print the final result
		}
		
		System.out.printf("%.1f", sum); //print the sum
		System.out.printf("%.1f", avg); //print the avarege

				
		sc.close();
	}

}
