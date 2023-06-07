package day05.solved;

class Account {
String accNo;
double balance;
//2000 bank balance//

public boolean withdraw (double amount) {
	//assume amount<balance//
	if(balance>amount) {
	balance=balance-amount;
	System.out.println(balance);
	return true;
	}
	else {
		return false;
	}
}
}

public class Banking{
public static void main (String[] args) {
	Account accountDetails = new Account();
	accountDetails.accNo="1234 4567 5678 6789";
	accountDetails.balance=1000;
	accountDetails.withdraw(1100);
}
}