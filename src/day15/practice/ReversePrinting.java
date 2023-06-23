package day15.practice;

import java.util.Scanner;

public class ReversePrinting {
	public static void main(String[] args) {
		// main method starts here

		Scanner scan = new Scanner(System.in);
		// scanner in-built method called here

		System.out.println("Enter a sentence: ");

		String sentence = scan.nextLine();
		// read the next line(return by user)

		String[] words = sentence.split(" ");
		// this is split for space

		StringBuilder reversedSentence = new StringBuilder();
		// string builder store the values
		for (int i = words.length - 1; i >= 0; i--) {
			// reversing the loop

			reversedSentence.append(words[i]).append(" ");
			//append the words and space in rs
		}
		
		System.out.println("Reversed Sentence: " + reversedSentence);
		// printing the value of reversedSentence

	}
}