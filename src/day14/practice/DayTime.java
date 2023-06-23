package day14.practice;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DayTime {
	public static void main(String[] args) {

		// main method starts here

		Date currentDate = new Date();
		SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy");

		
		
		SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
		
		String TodayDate = date.format(currentDate);

		String TodayTime = time.format(currentDate);

		System.out.println("Today's date is " + TodayDate + " and current time is " + TodayTime);

	}

}