import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestAccount {
	@Test
	public void Test() {
		SavingsAccount account1=new SavingsAccount("Vipul Somani",500);
		assertEquals("Vipul Somani",account1.getName());
		assertEquals(500,account1.getBalance(),0);
		account1.deposit(1000);
		assertEquals("Account Balance after deposit ",1500,account1.getBalance(),0);
		SavingsAccount account2=new SavingsAccount("Amit");
		PaymentGateway.transfer(account1, account2, 1000);
		assertEquals("Account Balance after transfering",500,account1.getBalance(),0);
		assertEquals("Account Balance after transfering",1000,account2.getBalance(),0);
		account2.withdraw(1000);
		assertEquals("Account Balance after Withdraw",0,account2.getBalance(),0);
		
		
		
		
	}

}
