
public class CheckingAccount extends BankAccount {

	
	//cost of clearing one check
	public static double FEE= 0.15;
	
	public CheckingAccount(String name, double amount)
	{
	    super(name, amount);
		String extension="-10";
		super.setAccountNumber(super.getAccountNumber() + extension);
	}
	
	
	@Override
	public boolean withdraw (double amount)
	{
			
		return super.withdraw(amount+FEE);
		
	}
}
