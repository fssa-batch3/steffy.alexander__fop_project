package misc;

import java.util.Scanner;

public class CheckingAlphabets {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char ch = scanner.next().charAt(0);
		scanner.close();
		if (Character.isLetter(ch)) {
			// Convert the character to lowercase for easier comparison
			ch = Character.toLowerCase(ch);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println("Vowel");
			} else {
				System.out.println("Consonant");
			}
		} else {
			System.out.println("Not an alphabet");
		}
	}
}