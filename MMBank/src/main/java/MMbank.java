
public class MMbank {

	public static void main(String[] args) {
		try {
			SavingsAccount account1=new SavingsAccount("Vipul Somani",500);
			account1.display();
			SavingsAccount account2=new SavingsAccount("Amit");
			account2.display();
			System.out.println("Depositing Amount 500 in Vipul's Account");
			account1.deposit(500);
			account1.display();
			System.out.println("Depositing Amount 500 in Amit's Account");
			account2.deposit(500);
			account2.display();
			System.out.println("Transfering amount from Vipul's account to Amit's Account");
			PaymentGateway.transfer(account1, account2, 500);
			account1.display();
			account2.display();
			System.out.println("Withdrawing Amount 500 fromn Amit's Account");
			account2.withdraw(500);
			account2.display();
			System.out.println("Next account no will be");
			SavingsAccount.getNextAccountNo();
					
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
