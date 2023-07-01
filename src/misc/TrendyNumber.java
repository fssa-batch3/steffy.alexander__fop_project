package misc;

import java.util.Scanner;

public class TrendyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		int i = 0;
		char one = num.charAt(1);
		int ans = (int) one;

		if (ans % 3 == 0) {
			System.out.println("Trendy Number");
		} else {
			System.out.println("Not a Trendy Number");
		}

	}

}
