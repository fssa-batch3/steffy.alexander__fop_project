package day11.solved;

//running an nullpointer exception
public class NullPointerException {
	public static void main(String[] args) {

		// declaring string pointer as null

		String message = null;

		// message is null so it will not print anything
		System.out.println(message.indexOf("Hi"));
	}
}
