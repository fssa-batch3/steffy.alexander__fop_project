package day05.solved;

class Account {
String accNo;//87656765456
double balance;//8767
//2000 bank balance//

public boolean withdraw (double amount) { //amount=1200
	//assume amount<balance//
	if(balance>amount) {
	balance=balance-amount;

	System.out.println("The amount is withdrawed successfully amount "+amount);
	System.out.println("Current balance is "+balance);
	
	return true;
	}
	else {
		System.out.println("The amount reaches the balance amount");
		return false;
	}
}
public void deposit (double creditedValue) {
	balance= balance+ creditedValue;
	System.out.println("Current balance is "+balance);
	System.out.println("credited value is" +creditedValue);
}

}


public class Banking{
public static void main (String[] args) {
	Account accountDetails = new Account();
	accountDetails.accNo="1234 4567 5678 6789";
	accountDetails.balance=1000;
	accountDetails.withdraw(800);
	accountDetails.deposit(300);
}
}