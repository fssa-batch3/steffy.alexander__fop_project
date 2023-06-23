package misc;

import java.util.Scanner;
public class addF {
	class Main
	{
	  public static void main(String args[])
	  {
		  Scanner scan=new Scanner(System.in);
		  int a=scan.nextInt();
		  float b=scan.nextFloat();
		  double c=scan.nextDouble();
		  long l=scan.nextLong();
		  String d=scan.nextLine();
		  
		  float bc =(float) (b/c);
			int ca = (int) (c/a);
			int res = (int) (ca+l);
			char ch = d.charAt(3);
			System.out.printf("%.1f",bc);
			System.out.print(" "+ca+" ");
			System.out.println(res);
			System.out.println(d+" "+ch);
		  
		  
		  
	  
	  }
	}
}
