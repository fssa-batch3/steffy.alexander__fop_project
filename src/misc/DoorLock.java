package misc;
import java.util.Scanner;
public class DoorLock {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter");
	int doorlock=scan.nextInt();
	
	int fst= doorlock / 1000;
	int scd= doorlock %100;
	int sum=fst+scd;
	System.out.println(sum);
    
	}
	
}

