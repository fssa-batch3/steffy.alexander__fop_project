package day07.practice;

import java.util.Scanner;

public class ScannerPositive {
 public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
    System.out.println("Enter the number : ");
    int num = s.nextInt();
    if(num>0) {
    	System.out.println("The number you had entered  is positive");
    }
    else if(num==0){
    	System.out.println("The number is "+num);
    }
    else{
    	System.out.println("The number you had entered is negative");
    }
}
}