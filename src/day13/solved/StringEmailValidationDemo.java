package day13.solved;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//with matcher in-built method
public class StringEmailValidationDemo {

	public static void main(String[] args) {

		String email = "suryafreshworks.com";

		// Below is a Regex by RFC standard RFC 5322
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		Boolean isMatch = matcher.matches();
//		Boolean isMatch = Pattern.matches(regex, email);

		if (isMatch) {
			System.out.println("The email address is: Valid");
		} else {
			System.out.println("The email address is: Invalid");
		}

	}

}