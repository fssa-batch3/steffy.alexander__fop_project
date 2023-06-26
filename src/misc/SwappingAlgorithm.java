package misc;

import java.util.Scanner;
public class SwappingAlgorithm {
public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("value a");
    int a=scan.nextInt();
    int b=scan.nextInt();
    
     int ah=a+b;
     int bh=ah-b;
     int ch=bh+bh;
     int dh=ah-bh;
     
     
     System.out.println(ch);
     System.out.println(bh);
     
}
}
