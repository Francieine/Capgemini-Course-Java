import java.time.LocalDate;

public class DateExemple01 {

	public static void main(String[] args) {
	
		//Texto ISO 8601 ---> Data-hora

LocalDate DataHora = LocalDate.parse("2023-12-13T09:12:26");
	
System.out.println("Data-Hora no formato ISO = " + DataHora);
	
		}
	}
