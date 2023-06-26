package misc;

import java.util.Scanner;
public class CaseDay {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a day");
	int num=scan.nextInt();
	
	
	switch(num){
		case 1,3,5,7,8,10,12:
			System.out.println("This month has 31 days");
			break;
			
		case 4,6,9,11:
			System.out.println("This month has 30 days");
			break;
			
		case 2:
			System.out.println("This month has 28 or 29 days");
			break;
		
		default:
			System.out.println("invalid"+"Enter a valid month");
			
			break;
	}
}
}
