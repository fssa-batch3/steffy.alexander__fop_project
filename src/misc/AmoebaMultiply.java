package misc;

import java.util.Scanner;

public class AmoebaMultiply {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int num2 = 0;//1,1
		int num3 = 1;//0,1,1,2,3
		for (int i = 0; i < num - 2; i++) {
			int add = num2 + num3;//1
			num2 = num3;//
			num3 = add;//
		}
		System.out.print(num3);
	}
}
