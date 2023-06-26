package misc;

import java.util.Scanner;
public class FindingGreater {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a value");
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	int num3=scan.nextInt();
	int max=num1;
	
	if(num2>max) {
		max=num2;
	}
	if(num3>max) {
		max=num3;
	}
	System.out.println("the maxvalue"+ max);
	
}
}