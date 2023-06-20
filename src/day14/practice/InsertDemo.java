package day14.practice;

public class InsertDemo {

	public static void main(String[] args) {
		StringBuilder newstr = new StringBuilder("Hello");
		int index = 5;
		String insert = " How you doing?";
		newstr.insert(index,insert);
		System.out.println(newstr);

	}
}