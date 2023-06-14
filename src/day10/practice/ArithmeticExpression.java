package day10.practice;

import java.util.Scanner;

public class ArithmeticExpression {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks: ");
		int marks = sc.nextInt();
		
		System.out.println("Enter the total number of subjects: ");
		int subjects = sc.nextInt();
		
		try {
			 int res = marks/subjects; 
			 System.out.println(res);
			 
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			
		}
	}
}