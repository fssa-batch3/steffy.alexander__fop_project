package day12.practice;

import java.util.Scanner;

public class EmailValidaion {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your email");
         String email=scan.nextLine();
       //Getting a email value from user
         
         if(email.contains("@") && email.contains(".")) {
        	//if the email input contains @ and dot  if block is executed
        	 System.out.println("email is verified");
         }
         else {
        	//if the email input not contains @ and dot  else block is executed
        	 System.out.println("email is incorrect");
         }
	}
}
