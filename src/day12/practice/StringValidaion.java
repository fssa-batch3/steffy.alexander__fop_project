package day12.practice;

import java.util.Scanner;

public class StringValidaion {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string value");
		
		String str = scan.nextLine();
		//Getting string value from user 

		if (str.length()>=5 && str.length()<=15) {
			//if the length of the string is between 5 and 15 if block is executed
			System.out.println("String is verified");
			
		} else {
			//if the length of the string is not between 5 and 15 else block is executed
			System.out.println("String is incorrect");
		}
	}
}
