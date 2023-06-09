package day06.practice;


import java.util.Scanner;

public class GetUserScanner {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter a name: ");
		
		String str= sc.nextLine();
		
		System.out.println("Hi,"+str);
		System.out.println("Enter a age: ");
		
		int age=sc.nextInt();
		System.out.println("Hi,"+str+" "+"Your age is "+ age);
		
		System.out.println("Enter a degree: ");
		
		String degrees=sc.next();

		System.out.println("Your Degree is "+degrees);
		
	sc.close();
	}
}