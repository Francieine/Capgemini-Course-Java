//get time unit
import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateExemple13 {

	  public static void main(String[] args) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z")); //UTC Format display time three hours apart Brazil
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance(); //
		cal.setTime(d);
		int minutes = cal.get(Calendar.MINUTE); //extract the minutes the time
		int month = 1 + cal.get(Calendar.MONTH); //extract the month the time
		
		System.out.println("minutes: " + minutes);
		System.out.println("month: " + month);

		
		}
	}
