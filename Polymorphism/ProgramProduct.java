package Products;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Employees.Employee;

public class ProgramProduct {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		List<Product> list = new  ArrayList<>(); //code for product's list
		
		System.out.println("Enter with the  products number: ");
		int prodNumber = sc.nextInt();
		
		for(int i = 1; i <= prodNumber; i++) {
			
			System.out.println("It's a Imported product (y/n)? ");
			char ch = sc.next().charAt(0);
			
			System.out.println("Product Name: ");
			sc.nextLine();
			String prodName = sc.nextLine();
			
			System.out.println("The price of product: ");
			double priceProd = sc.nextDouble();
			
			if(ch == 'n') {
				list.add(new Product(prodName, priceProd));
			}else if(ch == 'y') {
				System.out.println("Manufacturing date (DD/MM/YYYY): " );
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct());

			}else {
				System.out.println("Imported tax: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(prodName, priceProd, customsFee));
			}
			
		}
		
		System.out.println("");
		System.out.println("Tags price: ");
		
		for (Product prod : list) {
			System.out.println(prod.priceTag());

		}
		sc.close();
	}

}
