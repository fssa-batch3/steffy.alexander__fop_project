package misc;

import java.util.Scanner;

public class LucasSequence {

	public static void main(String args[]) {
		// Try out your code here
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a = 0, b = 0, c = 1;
		for (int i = 0; i < num; i++) {
			System.out.print(a + " ");
			int sum = a + b + c;
			a = b;
			b = c;
			c = sum;
			if (i >= num) {
				System.out.print(a + " " + b + " " + c + " ");
			}

		}
	}
}
