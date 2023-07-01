package misc;

import java.util.Scanner;

public class CollatzProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println(num);
		int count = 0;
		while (num != 1) {
			count++;
			if (num % 2 == 0) {
				num /= 2;
			} else {
				num = (3 * num) + 1;
			}
			System.out.println(num);
		}
		System.out.println(count);
	}
}