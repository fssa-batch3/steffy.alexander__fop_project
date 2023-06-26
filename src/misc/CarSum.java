package misc;

import java.util.Scanner;

public class CarSum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();

		if (num1 % num4 == 0) {
			System.out.println("Car 1 goes into road A");
		} else if (num2 % num4 == 0) {
			System.out.println("Car 1 goes into road B");
		} else if (num3 % num4 == 0) {
			System.out.println("Car 1 goes into road C");
		} else {
			System.out.println("No path exists");
		}
	}
}
