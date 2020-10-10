
public class SavingsAccount {

	private int accountNo;
	private static int accountnumber =20200001;
	private String name;
	private double balance;
	//IIB for different account number
	{
		this.accountNo = accountnumber;
		accountnumber++;
	}
	//Account creation with initial balance
	public SavingsAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	//Zero(0) balance account
	public SavingsAccount(String name) {
		this.name=name;
		this.balance=0;
	}
	//Deposit Method
	public void deposit(double deposit) {
		balance += deposit;

	}


	public void withdraw(double withdraw) {
		if (balance <= 0) {
			System.out.println("Error 401 Balance is not Enough!!!!!");
		} else {
			balance -= withdraw;
		}
	}

	public void display() {
		System.out.println("Account No: " + accountNo);
		System.out.println("Name: " + name);
		System.out.println("Balance: " + balance);
	}

	public static void getNextAccountNo() {
		System.out.println("Next account number will be: " + (accountnumber));
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public int getAccountNo() {
		return accountNo;
	}

}
