package day08.practice;

public class PrimeNumber {
	public static void main(String[] args) {
		int num = 6;
		int count = 0;
		for (int i = 2; i <= num - 1; i++) {
			if (num % i == 0) {
				count++;
				break;
			}
		}
		// condition to find prime number
		if (count == 0 && num != 1) {
			// printing the prime number
			System.out.println(num + " is a prime number.");
		} else {
			// printing which is not a prime number
			System.out.println(num + " is not a prime number.");
		}
	}
}
