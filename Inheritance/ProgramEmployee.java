package Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Employee>list = new ArrayList<>(); //criar uma lista de funcionarios
 		
		System.out.println("Enter the number of employees: ");
		int n = sc.nextInt();
		
		
		for(int i = 1; i <= n; i++) { //percorrer a lista de acordo com o numero digitado na entrada de dados
			System.out.println("Employee #" + i + "data:" );
			
			System.out.println("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			
			System.out.println("Name: ");
			sc.nextLine();//quebra de linha
			String name = sc.nextLine();
			
			System.out.println("Hours: ");
			int hours = sc.nextInt();
			
			System.out.println("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if(ch == 'y') { 
				System.out.println("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				
				list.add(new OutsourcedEmployee (name, hours, valuePerHour, additionalCharge)); //adicionando na lista as informações
			}else {
				list.add(new Employee (name, hours, valuePerHour));
			}

			//impressao das informações
			System.out.println("");
			System.out.println("Payments: ");
			
			for (Employee emp : list) {
				System.out.println(emp.getName() + "  - $ " + String.format("%.2f", emp.payment()));

			}

		}
		sc.close();
	}

}
