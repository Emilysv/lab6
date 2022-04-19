
public class SavingsAccount extends BankAccount 
{
	//annual interest rate
	private double rate= 2.5;
	private int savingsNumber=0;
	private String accountNumber;
	
	
	
	public SavingsAccount( String name, double balance)
	{
		super(name, balance);
		String accnum= (super.getAccountNumber()+ "-"+ savingsNumber);	
		this.accountNumber= accnum;
		
	}
	
	//method for monthly interest
	public void postInterest()
	{
		double interest= ((getBalance())* (rate/12)/100);
		setBalance(getBalance()+interest);
	}
	
	//overidding method for account number
	@Override
	public String getAccountNumber()
	{
		return this.accountNumber;
		
	}
	
	//copy constructor
	public SavingsAccount(SavingsAccount oldAccount, double balance)
	{
		super(oldAccount, balance);
		this.savingsNumber=oldAccount.savingsNumber +1;
		String accnum=super.getAccountNumber()+ "-"+savingsNumber;
		accountNumber=accnum;
		
	}
	
	
}
