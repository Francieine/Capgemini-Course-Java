package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class ProgramContract {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // o formato da data que sera lido

		System.out.println("Entre com os dados do contrato: ");
		System.out.print("Numero do contrato: ");
		int number = sc.nextInt();

		System.out.println("Entre com a data do contrato: (d/mm/yyyy) ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);

		System.out.println("Entre com o valor do contrato: ");
		double totalValue = sc.nextDouble();

		Contract obj = new Contract(number, date, totalValue);

		System.out.println("Entre com o numero de parcelas: ");
		int n = sc.nextInt();

		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(obj, n);

		System.out.println("Parcelas: ");

		for (Installment installment : obj.getInstallments()) {
			System.out.println(installment);

		}
		sc.close();
	}

}
