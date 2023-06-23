package day11.practice;

class User{

	public static void validateUsername(String username) throws IllegalArgumentException {
		if (username == null) {
			// throw an Illegal Argument Exception
			throw new IllegalArgumentException("Username is null");
			// error message "Invalid Username"
		}

		if (username.length() < 8) {

			// throw an Illegal Argument Exception
			throw new IllegalArgumentException("Username must contain atleast 8 charc");
			// with message "Username must have at2least 8 chars";
		}
	}

	public static void validateAge(int age) throws IllegalArgumentException {
		// Add your code here to validate
		if (age > 18) {
			throw new IllegalArgumentException("age must be above 18");
		}
		// Throw an IllegalArgumentException
		// With error msg "Invalid age"
	}
}

public class IllegalArgumentException2 {

	public static void main(String[] args) {
// Fix the compiler Errors as well after removing the 
		// valid lines of code
		String username = "steffy";
		int age = 8;
		try {
			User.validateUsername(username);
			User.validateAge(age);

			// Add code to validate age
			// UserAccount.validateAge();
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("Handling Illegal argument exception is completed");
		}

	
	}
}






