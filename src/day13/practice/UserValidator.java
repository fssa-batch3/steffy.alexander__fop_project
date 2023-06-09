package day13.practice;

import day13.solved.StringEmailValidationDemo;


class User {
	int id;
	String name;
	String password;
	String email;

	public void setId(int id_parameter) {
		this.id = id_parameter;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

}

public class UserValidator {
	public static void main(String[] args) {
		User user = new User();
//		UserValidation validation=new UserValidation();
		user.setId(2);
		user.setName("steffy");
		user.setPassword("123422");
		user.setEmail("steffy@gmail.com");
		UserValidation.validate(user);

	}
}

class UserValidation {
	public static void validate(User recUser) {
//		System.out.println(recUser.getId());
		if (recUser.getId() >= 0) {
			System.out.println("id is verified");
		} else {
			System.out.println("id should be positive");
		}

		if (recUser.getName().length() > 2) {
			System.out.println("name is valid");
	}else{
			System.out.println("name is invalid");
		
	}
//		verifing the password
		PasswordValidation.passvalidation(recUser.getPassword());
		StringEmailValidationDemo.Emailvalidation(recUser.getEmail());
		
	}
	}