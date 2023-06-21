package day14.solved;

public class StringBufferDemo {

	public static void main(String[] args) {

		String firstName = "Sachin";
		String lastName = " Tendulkar";

		StringBuffer fullName = new StringBuffer();//"I AM"+"Balaji"
		fullName.append(firstName);
		fullName.append(" ");
		fullName.append(lastName);

		System.out.println(fullName);

	}

}
