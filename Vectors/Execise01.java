import java.util.Locale;
import java.util.Scanner;

public class TypingNumbers {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choice the numbers for ten positions");
		int[] numbers = new int[10];
		
		System.out.println("Type one number:");
		for(int i=0; i<numbers.length;i++) {
			numbers[i] = sc.nextInt();
		}
		
		System.out.println("-----------------------------Info about typed numbers------------------------------");
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(i);
			
			
		}
		sc.close();
	}
	
	
}
