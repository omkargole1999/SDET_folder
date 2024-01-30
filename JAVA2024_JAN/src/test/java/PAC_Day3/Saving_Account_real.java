package PAC_Day3;
import PAC_Day3.savings_account_class;
public class Saving_Account_real extends savings_account_class{
	final double minbalance = 5000;
	public Saving_Account_real(String accNum, double balance, String accHolder) {
		super(accNum, balance,accHolder);
		
		
	}

	@Override
	public void withdraw(double amt) {
		if(balance <= minbalance)
		{
			balance -=amt;
		}
		else
			System.out.println("Transaction failed low balance");
		
	}

}
