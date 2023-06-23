package day15.practice;

import java.util.Scanner;

public class PrintUserDetails {
	//creating a class 
	public static void main(String[] args) {
		//main methods starts 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
        String name=scan.next();
        //the data given by the user
        System.out.println("Hi"+" "+ name+ " please enter your age");
        //printing name given by user
        int age=scan.nextInt();
        
        System.out.println("Hello"+" "+ name+ ".Next year you'll be"+" "+(age+1)+".");
        //printing the name and also adding extra 1 yr
	}
}
