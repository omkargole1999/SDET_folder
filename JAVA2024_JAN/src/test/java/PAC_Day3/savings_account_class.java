package PAC_Day3;

public class savings_account_class{
	  public String accNum;
	  public double balance;
	  public String accHolder;
	  
	  
	  public savings_account_class(String accNum, double balance, String accHolder) {
		
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	public void deposit(double amt)
	  {
		  balance +=amt;
	  }
	  public void withdraw(double amt)
	  {
		  balance -= amt;
	  }
	   
public String getAccNum() {
		return accNum;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}


}
