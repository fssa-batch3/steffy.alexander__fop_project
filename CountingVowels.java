package day15.practice;

import java.util.Scanner;

public class CountingVowels {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a sentence");
		String input = scan.next();
		 String value=input.toLowerCase();
          int Vowelcount=0;
		for (int i = 0; i < input.length(); i++) {
			if (value.charAt(i) == 'a' || value.charAt(i) == 'e' || value.charAt(i) == 'i' || value.charAt(i) == 'o'
					|| value.charAt(i) == 'u') {
//				System.out.println("the given sentence contains vowel-" + " " + input.charAt(i));
				
				  Vowelcount+=1;
				
			}

		}
		System.out.println("Number of vowels in this sentence- " +Vowelcount);
	}
}
