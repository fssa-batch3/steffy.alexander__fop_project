package day14.practice;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class LocalDatePractice {

	public static void main(String[] args) {
//Date in String format
		String birthdayString= "2004-07-20";

		// Format the DateString is In.
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		// Converting dateString to LocalDate
		LocalDate parsedDate = LocalDate.parse(birthdayString, formatter);
		System.out.println(parsedDate);
		System.out.println(parsedDate.getYear());
		System.out.println(parsedDate.getMonth());
		System.out.println(parsedDate.getMonthValue());
		System.out.println(parsedDate.getDayOfMonth());
		System.out.println(parsedDate.getDayOfWeek(	));
		
	}

}
