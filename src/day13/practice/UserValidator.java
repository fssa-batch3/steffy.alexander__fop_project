package day13.practice;

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
	public static void validate(User user) {
		System.out.println(user.getId());
		if(user.getId()>=0) {
			System.out.println("id is verified");
		}
		else {
			System.out.println("id should be positive");
		}
		
		
		System.out.println(user.getName());
		System.out.println(user.getPassword());
		System.out.println(user.getEmail());
	}

}