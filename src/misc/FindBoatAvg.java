package misc;

import java.util.Scanner;

public class FindBoatAvg {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter");
		int weight = scan.nextInt();
		int adults = scan.nextInt();
		int children = scan.nextInt();
		int ad = adults * 75;
        
		int child = children * 30;
		int num=ad+child;
		if(num>weight) {
			System.out.println("Boat will sink");
		}
		else {
			System.out.println("Boat will stable");
		}
		

	}
}
