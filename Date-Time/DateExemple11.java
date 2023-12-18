import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExemple11 {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); // formatting date in text
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date x1 = new Date(); // create a date now
		Date x2 = new Date(System.currentTimeMillis()); // get the instant and parse to milliseconds and create the date
														// value based it

		Date y1 = sdf1.parse("18/12/2023"); // parsing text in date
		Date y2 = sdf2.parse("18/12/2023 09:22:07");

		System.out.println("x2 = " + sdf2.format(x2));

	}
}
