//Payment Gateway Class
public class PaymentGateway {
	//Method for transferring money from sender account to receiver account
	public static boolean transfer(SavingsAccount sender, SavingsAccount reciever, double amount) {
		if (sender.getBalance() > amount) {
			sender.withdraw(amount);
			reciever.deposit(amount);
			return true;
		} else {
			System.out.println("Balance in not enough!!!!!");
			return false;
		}
	}
}
