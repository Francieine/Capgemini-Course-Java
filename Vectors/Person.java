package Entities;

public class Person {

	//proprieties
	public String name;
	public int age;
	public double heigth;
	
	
	//constructor
	public Person(String name, int age, double heigth) {
		this.name = name;
		this.age = age;
		this.heigth = heigth;
	}

	//Getters and setters

	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	
	public double getHeigth() {
		return heigth;
	}


		
	
}
