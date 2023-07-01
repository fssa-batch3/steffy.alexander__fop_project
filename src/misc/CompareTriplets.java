package misc;

import java.util.Scanner;
public class CompareTriplets {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("jh");
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	
	if(num1==num2) {
		System.out.println(num1+" and "+num2+" are equal");
	}
	else if(num1>num2) {
		System.out.println(num1+" greater than "+num2);
	}
	else if(num2>num1) {
		System.out.println(num1+" less than "+num2);
	}
}
}
