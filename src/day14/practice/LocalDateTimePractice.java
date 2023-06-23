package day14.practice;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimePractice {
	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println(date);

		LocalDateTime time = LocalDateTime.now();
		System.out.println(time);
	}

}