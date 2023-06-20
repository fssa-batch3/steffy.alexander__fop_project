package day14.practice;

import java.time.Period;
import java.time.LocalDate;

public class CalculatingDatebetwween{
public static void main(String[] args) {
	LocalDate date1=LocalDate.of(2023, 6, 10);
	LocalDate date2=LocalDate.of(2023, 6, 20);
	
	Period period=Period.between(date1, date2);
	int daycount=period.getDays();
	System.out.println(daycount);

}
}
