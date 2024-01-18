package consultorio;

import java.util.Scanner;

public class Consultorio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Digite o nome do Medico: ");
		String med = sc.nextLine();
		
		System.out.println("Digite o endereço do Medico: ");
		String end = sc.nextLine();
		
		System.out.println("Digite o horario de atendimento do Medico: ");
		String aten = sc.nextLine();
		
		System.out.println("Digite a especialidade do Medico: ");
		String esp = sc.nextLine();
		
		Medico medico = new Medico(med, end, aten,esp);
		
		System.out.println("----------------  INFO: -------------------");
		
		System.out.println("Nome: " + medico.getNome());
		System.out.println("Endereço: " + medico.getEndereco());
		System.out.println("Horario de atendimento: " + medico.getHorario());
		System.out.println("Especialiadade em: " + medico.getEspecialidade());
		
	}

}
