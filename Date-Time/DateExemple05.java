import java.time.LocalDateTime;

public class DateExemple01 {

	public static void main(String[] args) {
	
		//Texto ISO 8601 ---> Data-hora

LocalDateTime DataHora = LocalDateTime.parse("2023-12-13T09:12:26");
    
System.out.println("Data-Hora ISO8601: " + DataHora);

	}
}
