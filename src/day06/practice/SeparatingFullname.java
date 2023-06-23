package day06.practice;

public class SeparatingFullname {
	public static void main(String[] args) {
String FullName="Jane Doe";


//Method1
System.out.println("First name is " +FullName.substring(0,5));
System.out.println("Last name is " + FullName.substring(5,8));


//Method2
String[] Name=FullName.split(" ");
System.out.println("First name is " + Name[0]);
System.out.print("Last name is " + Name[1]);



}
}