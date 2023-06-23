package day15.practice;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		// main method starts here

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your sentence: ");

		String input = scan.nextLine();
		// the data given by the user

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			// running a for loop
			char currentChar = input.charAt(i);

			if (result.indexOf(String.valueOf(currentChar)) == -1) {
        //condition to check whether the char is already exists if exists it won't append
				result.append(currentChar);
			
			}
		}

		System.out.println("Result: " + result);
		//finally printing the result

	}
}