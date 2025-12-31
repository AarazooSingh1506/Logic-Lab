package oops;

public class AccountNumber {
	private final String digits;
	
	public AccountNumber(String inputDigits) {
		if(isValid(inputDigits)) {
			this.digits = inputDigits;
		}else {
			System.out.println("Invalid account number");
			this.digits = "000000000000";
		}
	}
	
	public static boolean isValid(String value) {
		if (value.length() != 12) {
			return false;
		}
		
		for(int i =0;i<value.length(); i++) {
			if(!Character.isDigit(value.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	public String getDigits() {
		return digits;
	}

	public static void main(String[] args) {
		AccountNumber account1 = new AccountNumber("123456789012");
		System.out.println(account1.getDigits());
		
		AccountNumber account2 = new AccountNumber("ABC");
		System.out.println(account2.getDigits());
	}

}
