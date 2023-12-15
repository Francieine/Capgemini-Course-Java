import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DateExemple06 {

	public static void main(String[] args) {
		
		//convertendo data-hora global para local
		
		Instant d06 = Instant.parse("2023-12-15T09:14:26Z");
		
		LocalDate resultado1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); //converte do horario local para o atual conforme o fuso-horario do computador do usuario
		System.out.println("Resultado 1 = " + resultado1);
		
		LocalDate resultado2 = LocalDate.ofInstant(d06, ZoneId.of("Hongkong")); // resultado para horario de hongkong
		System.out.println("Resultado 2 = " + resultado2);
		
		LocalDateTime resultado3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault() ); //
		
		System.out.println("Resultado 3 = " + resultado3);
		
		LocalDateTime resultado4 = LocalDateTime.ofInstant(d06, ZoneId.of("Hongkong"));
		System.out.println("Resultado 4 = " + resultado4);
		
		}
	}
