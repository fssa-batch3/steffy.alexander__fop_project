package misc;
import java.util.Scanner;
public class CalculatingExpenses {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
//	System.out.println("ener");
	int num=scan.nextInt();
	if(num<=200) {
		System.out.println("Rs."+num*0.5);
	}
	else if(num<=400) {
		System.out.println("Rs."+num*0.65+100);
	}
	else if(num<=600)
	{
		System.out.println("Rs."+num*0.80+200);
	}
	else if(num>=600)
	{
		System.out.println("Rs."+num*1.25+425);
	}
	
}
}
