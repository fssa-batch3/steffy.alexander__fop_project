package day14.solved;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateDemo3 {

	public static void main(String[] args) {

		// Date in String format
		String dateString = "21/06/2023";

		// Format the DateString is In.
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		// Converting dateString to LocalDate
		LocalDate parsedDate = LocalDate.parse(dateString, formatter);//2023-06-21
		System.out.println(parsedDate);
		System.out.println(parsedDate.getYear());
		System.out.println(parsedDate.getMonth());
		System.out.println(parsedDate.getMonthValue());
		System.out.println(parsedDate.getDayOfMonth());
		System.out.println(parsedDate.getDayOfWeek());
		System.out.println(parsedDate.minusDays(10));
	}

}