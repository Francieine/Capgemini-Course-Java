package Application;

import java.util.Scanner;

import Entities.Person;

public class ProgramHeight {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//devicing size vectors, typed for user in the key - input datas
		
		System.out.println("Typed the how many people to get info"); //for print in screen
		int sizeVector = sc.nextInt(); // for input datas
		
		
		//making vector/objct's people
		
		Person[] person = new Person[sizeVector];
		
		
		//loop for arround the vector
		
		for (int i = 0; i < sizeVector; i++) {
			System.out.println("Type the person's info " + (i +1) + ":");
			
			System.out.println("Name:");
			String name = sc.nextLine();
			
			System.out.println("Age:");
			int age = sc.nextInt();
			
			System.out.println("Height:");
			double heigth = sc.nextDouble();
			
			
			//making person and add inside vector
			person[i] = new Person(name, age, heigth);

			
		}
		
		
		//display storeged datas
		
		System.out.println("----------------------------Display info --------------------------------");
		
		for (Person persons : person) {
			System.out.println("Name: " + persons.getName());
			System.out.println("Age: " + persons.getAge());
			System.out.println("Heigth: " + persons.getHeigth());
		}
			
		sc.close();
	}

}
