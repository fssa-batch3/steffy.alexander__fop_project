package day13.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PasswordValidation {
	public static void passvalidation(String a) {
		String regex = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(a);
//		Boolean isMatch = matcher.matches();
		Boolean isMatch = Pattern.matches(regex, a);

		if (isMatch) {
			System.out.println("The password is: Valid");
		} else {
			System.out.println("The password is: Invalid");
		}
	}
	public static void main(String[] args) {
		String password = "abcA@1eg";
		
		PasswordValidation.passvalidation(password);

		// regular expression for the password validation
		//the pass should contain one spl character,one caps,one small,8 charc long
		
}
}