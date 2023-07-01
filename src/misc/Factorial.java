package misc;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		 
		int factorial=1;
		int i=1;
		while(factorial<num) {
			factorial*=i;
			i++;
			
		}
		if(factorial==num) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		}
	}

