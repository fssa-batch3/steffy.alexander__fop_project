package day10.solved;

/**
 * Handling the ArrayIndexOutOfBoundsException with a try catch
 */
public class ArrayOutOfBoundsWithException {
	public static void main(String[] args) {
		try {
			int[] intArr = { 49, 50, 70 };

			// Trying access an element which is not initialized and declared
			intArr[4] = 80;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}