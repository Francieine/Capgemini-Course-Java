import java.util.Scanner;

public class ProgramAnimal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Whats animal's name? ");
		String animalName = sc.nextLine();
		

		System.out.print("How many paws? ");
		String paw = sc.nextLine();
		
		System.out.print("How many tail? ");
		String tail = sc.nextLine();
		
		Animal animal1 = new Animal(animalName, 1, paw);
		
		System.out.println("-------------------------------INFORMAÇÕES---------------------------------------" );
		
		System.out.println("Animal: " + animal1.getNome());
		
		System.out.println("Paws: " + animal1.getPatas());
		
		System.out.println("Tails: " + animal1.getCauda());
		
		
		sc.close();
		
	}

}

