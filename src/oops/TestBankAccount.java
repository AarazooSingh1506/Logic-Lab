package oops;

public class TestBankAccount {
	public static void main(String[] args) {
		
		BankAccount acc = new BankAccount("Aarazoo Singh", 5000);
			
		acc.deposit(800);
		acc.withdraw(500);
		
		System.out.println(acc.getBalance());
		
		
	}

}
