package misc;

import java.util.Scanner;
public class MilageCheck {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter");
	int milage=scan.nextInt();
	int petrol=scan.nextInt();
	int distance=scan.nextInt();
	int ans=milage*petrol;
	if(ans<distance) {
		System.out.println("Cannot reach");
	}
	else {
		System.out.println("Can reach");
	}
	}
}

