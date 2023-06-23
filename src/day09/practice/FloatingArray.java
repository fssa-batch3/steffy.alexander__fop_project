package day09.practice;

public class FloatingArray {

	public static void main(String[] args) {

		// main method starts here

		float[] arr = { 23.9f, 345.92f, 78.0f, 9807.30f, 89.90f };
		// Declare array arr in float data type by the element

		// declaring variable as sum
		float sum = 0;

		for (int i = 0; i < arr.length; i++) {// iterating the loop in arr
			// sum each element in array in each iteration
			sum += arr[i];

		}
		System.out.println("Average value =" + "" + sum / arr.length);
		// average == / the sum of the elements by number of elements in
		// array

	}
}
