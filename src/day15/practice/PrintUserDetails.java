package day15.practice;

import java.util.Scanner;

public class PrintUserDetails {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
        String name=scan.next();
        System.out.println("Hi"+" "+ name+ " please enter your age");
        int age=scan.nextInt();
        System.out.println("Hello"+" "+ name+ ".Next year you'll be"+" "+(age+1)+".");
	}
}
