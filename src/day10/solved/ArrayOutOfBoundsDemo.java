package day10.solved;

/**
 * Demo of what happens when we access more elements
 */
public class ArrayOutOfBoundsDemo {
	public static void main(String[] args) {
		int[] intArr = { 49, 50, 70 };

		// Trying access an element which is not initialized and declared
		// intArr[4] = 80; (it won't work)because there is no 4 index in the intArr

		intArr[2] = 80;
		System.out.println(intArr[2]);
	}
}