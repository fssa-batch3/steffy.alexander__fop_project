package day14.practice;

import java.util.Scanner;

public class ReversedString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String Sentence = scan.nextLine();
		String reversed = reverseSentence(Sentence);
		System.out.println("Reversed sentence is: " + reversed);
		scan.close();
	}

	private static String reverseSentence(String Sentence) {
		String[] words = Sentence.split("\\s+");

		StringBuilder reverse = new StringBuilder();

		for (int i = words.length - 1; i >= 0; i--) {

			reverse.append(words[i]).append(" ");
		}
		return reverse.toString().trim();
	}

}
