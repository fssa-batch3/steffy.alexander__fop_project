package day10.practice;

import java.util.Scanner;

public class IntegerString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int check;
		do {
			check = 0;// initially check is 0
			try {
				System.out.println("Enter your Integer: ");
				String intnum = sc.nextLine();
				int b = Integer.parseInt(intnum);//causes error while char is entered

			}
			catch (NumberFormatException e) {
				{

					System.out.println("enter a valid integer");

					e.getMessage();
					check = 1;
				}

			}
		}
		
		while (check == 1);

		System.out.println("success");
	}
}
