package day15.practice;

import java.util.Scanner;
public class Duplicate {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your sentence: ");
		
		String input = scanner.nextLine();  
		String result = removeDuplicateCharacters(input);  
		
		System.out.println("Result: " + result);  
	}
	public static String removeDuplicateCharacters(String input) {
		
		StringBuilder result = new StringBuilder(); 
		
		for (int i = 0; i < input.length(); i++) { 
			
			char currentChar = input.charAt(i);  
			
			if (result.indexOf(String.valueOf(currentChar)) == -1) {  
				
				result.append(currentChar);  
			}
		}
		return result.toString(); 
	}
}