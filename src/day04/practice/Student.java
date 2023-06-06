package day04.practice;

class StudentRecords {
String name;
int age;
int marks;

public void display() {
	System.out.println("display is invoked");
}


public void printmyname() {
	System.out.println("my name is " +name);
}
public void SetName(String myName) {
	name=myName;
}

public void printmyage() {
	System.out.println("my age is " +age);
}
public void SetAge(int myAge) {
	age=myAge;
}
public void printmymarks() {
	System.out.println("my marks is " +marks);
}

public void SetMarks(int myMarks) {
	marks= myMarks;
}

}

public class Student{
	public static void main(String[] args){
		StudentRecords data= new StudentRecords();
		data.SetAge(22);
		data.SetName("steffy");
		data.SetMarks(90);
//		System.out.println("my name is" +Name);
		data.printmyname();
		data.printmyage();
		data.printmymarks();
//		System.out.println("my name is" +age);
				
	}
	
}

