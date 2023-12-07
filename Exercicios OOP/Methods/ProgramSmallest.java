import java.util.Scanner;

public class ProgramSmallest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter with the first number: ");
		int numb1 = sc.nextInt();
		System.out.println("Enter with the second number: ");
		int numb2 = sc.nextInt();
		
		System.out.println("Enter with the third number: ");
		int numb3 = sc.nextInt();
		
		
		SmallestNumber numb = new SmallestNumber(numb1, numb2, numb3);
		
		System.out.println("Results: 0");
		
		numb.checkNumber();
		
		
		sc.close();
		
		
		
		
		
		
	}

}
