package day07.practice;


import java.util.Scanner;
public class IsVowel {
public static void main(String[] args) {

	
	
	Scanner letter=new Scanner(System.in);
	
	System.out.println("Enter a character");
	
	String alpha=letter.nextLine();
	Boolean check1=alpha.equals("a")||alpha.equals("e")||alpha.equals("i")||alpha.equals("o")||alpha.equals("u");
	Boolean check2=alpha.equals("A")||alpha.equals("E")||alpha.equals("I")||alpha.equals("O")||alpha.equals("U");
	
   if(check1||check2){
	  
	   System.out.println("The entered char is vowels");
   }
 

   else {
	   System.out.println("The entered char is consonant");
   }
   letter.close();
		
}
}
