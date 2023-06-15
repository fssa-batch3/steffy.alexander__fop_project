package day10.solved;

import java.util.Scanner;

public class ArithmeticExpressionDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 50;
		int n2 = sc.nextInt();
		System.out.println("Enter number:");

		// 10 will come
		// what if n2 is zero?
		// here we use arithmetic exception
		try {

			int res = n1 / n2;
			System.out.println(res);

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}