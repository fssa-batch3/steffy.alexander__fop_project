package day09.practice;

public class FindingMinMax {

	public static void main(String[] args) {

		int[] arr = { 9, 2, 4, 8, 1, 2 };

		// declaring the integer array with elements

		int max = 0;
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {

			// checking the max value

			if (arr[i] > max) {
				max = arr[i];

			}

		}
		// the maximum value==
		
		System.out.println("maximum number is " + max);

		for (int j = 0; j < arr.length; j++) {

			// check the condition

			if (arr[j] < min) {

				min = arr[j];

			}

		}
		// the minimum value==
		System.out.println("minimum number is " + min);
	}
}
