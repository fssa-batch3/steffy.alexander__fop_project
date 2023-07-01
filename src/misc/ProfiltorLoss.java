package misc;
import java.util.Scanner;
public class ProfiltorLoss {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int buyprice=scan.nextInt();
	int singleproValue=scan.nextInt();
	
	int total=singleproValue*12;
	System.out.println(total);

	if(total>buyprice) {
		System.out.printf("Profit : Rs. %d",total-buyprice);
	}
	else if(total<buyprice) {
		System.out.printf("Loss : Rs. %d",buyprice-total);
	}
	else {
		System.out.println("No profit nor loss");

	}
}
}
////Fee collection
//Write a program to determine the fee amount to be collected from a student. 
//Refer the table below for fee details.
//Student Type Student Type denoted as Fee Details  
//Merit Seat Day Scholar MSDS Tuition fee + Bus fee Merit Seat Hosteller MSH Tuition fee +
//Hostel fee Management Seat Day Scholar MGSDS 150% of Tuition fee + 
//Bus fee Management Seat Hosteller MGSH 150% of Tuition fee + Hostel fee
//Input format:
//
//The first input corresponds to the student type
//
//The second input corresponds to the tuition fee
//
//The third input corresponds to the bus fee
//
//The fourth input corresponds to the hostel fees
//
//
//
//Output format:
//
//Print the total fee amount of the corresponding student with 2 decimal places. 
//
//Refer below sample output for formatting
//
//
//
//Sample Input:
//
//MSH
//
//40000
//
//12000
//
//50000
//
//
//
//Sample Output:
//
//90000.00
//
//Case 1
//Case 2
//Case 3
//Input (stdin)
//MSDS
//50000
//15000
//60000
//
//Output (stdout)
//65000.00