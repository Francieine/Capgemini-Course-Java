package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class ProgramCar {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Enter datas the rental: ");
		
		System.out.print("Car model? ");
		String carModel = sc.nextLine();
		
		System.out.print("Exit date? (d/m/yyyy) ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Into date? (d/m/yyyy) ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
		
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel)); //objeto aluguel de carro associado com objeto veiculo
		
		
		System.out.print("Price per hour? ");
		double pricePerHour = sc.nextDouble();
		
		System.out.print("Price per day? ");
		double pricePerDay = sc.nextDouble();
		
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		rentalService.processInvoice(cr);
		
		System.out.println("INVOICE");
		System.out.println("Basic Payment" + cr.getInvoice());
		System.out.println("Tax" + cr.getInvoice().getTax());
		System.out.println("Total Payment: " + cr.getInvoice().getTotalPayment());
		
		sc.close();
		
	}

}
