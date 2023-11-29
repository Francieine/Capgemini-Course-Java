package Application;

import java.util.Locale;

import java.util.Scanner;

import Entities.Product01;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//making vector "n" products
		int n = sc.nextInt();
		Product01[] vect = new Product01[n]; //instancing vector
		
		for(int i = 0; i< vect.length; i++) { // use to transverse vector 
			sc.nextLine();
			String name = sc.nextLine(); //input name data (type in key)
			double price = sc.nextDouble(); //input price data (type in key)
			
			vect[i] = new Product01(name, price); // vector in "i" position received "name" and "price"
			
			/*summary 1) read name and price of the products 
			 2) record the price and name the objects */
		}
		
		//Calculing 
		double sum = 0.0; 
		for(int i=0; i < vect.length; i++) {
			sum += vect[i].getPrice(); //get just price
		}
		double avg = sum / vect.length;
		
		System.out.printf("Average price = %.2f%n", avg);
		
		
		sc.close();
		
	}

}
