package day14.solved;

// Both StringBuffer and StringBuilder are the same except StringBuffer is thread safe.
//Thread safety is a HOTS topic to be discussed more during CORE Java
public class StringBuilderDemo {

	public static void main(String[] args) {
  
    String firstName = "Virat ";
    String lastName = "Kohli";
    
    StringBuilder fullName = new StringBuilder();
    
    fullName.append(firstName).append(" ").append(lastName);
    //appending a fullname  and lastname with space using stringbuilder in-built method
    System.out.println(fullName);
	
	}

}