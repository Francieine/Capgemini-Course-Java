import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DateExemple07 {

	public static void main(String[] args) {
		
		//Obtendo dados da hora local: dia, mes, ano, horario
		
		LocalDate d04 = LocalDate.parse("2023-12-15");
		LocalDateTime d05 = LocalDateTime.parse("2023-12-15T09:52:26");
		
		System.out.println("Dia: "  + d04.getDayOfMonth());
		System.out.println("Mês: "  + d04.getMonthValue());
		System.out.println("Ano: "  + d04.getYear());
		System.out.println("Hora: "  + d05.getHour());
		System.out.println("Minuto: "  + d05.getMinute());
		
		}
	}


