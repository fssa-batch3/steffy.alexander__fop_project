package misc;

import java.util.Scanner;

public class AverageValue

{
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		
		float num1 = scan.nextFloat();
		float num2 = scan.nextFloat();
		float num3 = scan.nextFloat();
		float num4 = scan.nextFloat();
		float num5 = scan.nextFloat();

		float avg = (num1 + num2 + num3 + num4 + num5)/5;
		
		 System.out.printf("%.2f%n", avg);
	}
}