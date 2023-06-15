package day11.solved;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num1 = 10;
		int num2 = sc.nextInt();
		int res = num1 / num2;
		try {
			res = num1 / num2;
			System.out.println("It is an integer");
		} catch (ArithmeticException e) {
			System.out.println("It is not an integer");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
