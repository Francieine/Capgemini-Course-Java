import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExemple10 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); //formatting date in text
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date x1 = new Date(); //create a date now
		
		Date y1 = sdf1.parse("18/12/2023"); //parsing text in date
		Date y2 = sdf2.parse("18/12/2023 09:22:07");
		
		
		System.out.println("x1 = " + sdf2.format(x1)); 
		
		
	}
	}
