package misc;

import java.util.Scanner;

public class SwimmingPool {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("edcytf");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int area = num1 * num1 * num1 * 1000;
		if (num2 <= area) {
			System.out.println("can store");

		} else {
			System.out.println("cannot store");
		}
	}
}