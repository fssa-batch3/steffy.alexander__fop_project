package misc;
import java.util.Scanner;
public class AddingAxis {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter");
	int x1=scan.nextInt();
	int y1=scan.nextInt();
	int x2=scan.nextInt();
	int y2=scan.nextInt();
	
	float num1=(float)(x1+x2)/2;
	
	float num2=(float)(y1+y2)/2;
	System.out.printf("Binoy's house is located at("+num1+","+num2+")");
}
}
