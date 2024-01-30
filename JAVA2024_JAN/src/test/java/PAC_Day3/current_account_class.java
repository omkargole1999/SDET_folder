package PAC_Day3;

public class current_account_class extends savings_account_class {
    public double overdraft_limit = 10000;
	public current_account_class(String accNum, double balance, String accHolder) {
		super(accNum, balance, accHolder);
		
	}

	public void withdraw(double amt) {
		if(check_overdraft(amt) == true)
		{
			balance -=amt;
		}
		else
			System.out.println("Transaction failed over draft limit exceeded");
		
	}
	public boolean check_overdraft(double amt)
	{
		if(amt <= overdraft_limit)
		{
			return true;
		}
		return false;
	}

	
	
}