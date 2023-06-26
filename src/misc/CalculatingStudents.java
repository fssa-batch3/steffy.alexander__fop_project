package misc;

import java.util.Scanner;

public class CalculatingStudents {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int students = scan.nextInt();

		int size = scan.nextInt();
		int quotient = students / size;
		int reminder = students % size;
		System.out.println(quotient);
		System.out.println(reminder);

	}
}
