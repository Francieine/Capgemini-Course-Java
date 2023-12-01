package Application;

import java.util.Scanner;

public class RoomRent {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int n, amountRents;
		
		System.out.println("How many rooms will be rented?");
		n = sc.nextInt();
		
		String[] name = new String[n];
		String[] email = new String[n];
		int[] room = new int[n];
		
		for (int i = 0; i < n ; i++) {
			System.out.printf("--------People info ----------");
			System.out.println("Name: ");
			name[i] = sc.next();
			
			System.out.println("Email: ");
			email[i] = sc.next();
			
			System.out.println("Room: ");
			room[i] = sc.nextInt();
			
		}
		
		amountRents =0;
		
		for (int i=0; i < n; i++) {
			
			if(room[i] == 1) {
				System.out.printf("%s/n", name[i], "%d/n", room[0]);
			}if(room[i] == 2) {
				System.out.printf("%s/n", name[i], "%d/n", room[1]);
			}if(room[i] == 3) {
				System.out.printf("%s/n", name[i], "%d/n", room[2]);
			}
			amountRents = amountRents + room[i];
		}
		
		
		sc.close();
		
	}

}
