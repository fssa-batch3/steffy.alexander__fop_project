package day12.solved;

public class Divider {
	public static int dividing(int a, int b) throws IllegalArgumentException {
		// validating that b cannot be 0
		if (b == 0) {

			throw new IllegalArgumentException("the value cannot be a zero");

		}
		int result = a / b;
		return result;

	}

	public static void main(String[] args) {
		// main method starts here
		int a = 40;
		int b = 0;
		// declaring that values of a and b are 40 and 0
		try {
			Divider.dividing(a, b);

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
