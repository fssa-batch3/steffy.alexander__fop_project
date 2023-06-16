package day12.practice;

import java.util.Scanner;

public class EmailValidaion {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your email");
         String email=scan.nextLine();
         
         
         if(email.contains("@") && email.contains(".")) {
        	 System.out.println("email is verified");
         }
         else {
        	 System.out.println("email is incorrect");
         }
	}
}
