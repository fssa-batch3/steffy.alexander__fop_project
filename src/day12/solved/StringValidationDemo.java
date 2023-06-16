package day12.solved;

import java.util.Scanner;

public class StringValidationDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String input = scan.nextLine();
		if (input == null) {
			System.out.println("The input String is Null");
		} else if (input.trim().isEmpty()) {
			System.out.println("The input String is Empty");
		} else {
			System.out.println("The Input String is: " + input);
		}

	}
}