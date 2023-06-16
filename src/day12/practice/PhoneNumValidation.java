package day12.practice;

import java.util.Scanner;
public class PhoneNumValidation {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter your number:");
    long num=sc.nextLong();
    String num2=num+"";
    
  if(num2.length()>=10) {
	  System.out.println("Your mobile number is verified");
	  
  }
    
  else {
	  System.out.println("Enter a valid number");
	  
  }
}
}
