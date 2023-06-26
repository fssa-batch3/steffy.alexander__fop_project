package misc;
import java.util.Scanner;
public class FindQuadrant {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("yhj");
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	if(num1>=0 &&num2>=0) {
		System.out.println("Ist Quadrant");
	}
	else if(num1<=0 &&num2>=0) {
		System.out.println("IInd Quadrant");
	}
	else if(num1<=0 &&num2<=0) {
		System.out.println("IIIrd Quadrant");
	}
	else if(num1>=0 &&num2<=0) {
		System.out.println("IVth Quadrant");
	}
	else if(num1==0 && num2==0) {
		System.out.println("Origin");
	}
}
}
