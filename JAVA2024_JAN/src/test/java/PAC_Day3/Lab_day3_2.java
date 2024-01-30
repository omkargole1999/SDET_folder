package PAC_Day3;

import java.util.UUID;

public class Lab_day3_2 {

	public static void main(String[] args) {
		Person smith = new Person("Smith" , 34.5f);
		Person kathy = new Person("Kathy" , 45.5f);
		Account a1 = new Account(smith , 50000.35);
		Account a2 = new Account(kathy , 100000.921);
		a1.deposit(20000);
		a2.withdraw(20000);
		System.out.println(a1.getBalance());
		System.out.println(a2.getBalance());
		System.out.println("Smith account number"+a1.getAccNum());
		System.out.println("Kathy account number"+a2.getAccNum());
		
		
	}

	@Override
	public String toString() {
		return "Lab_day3_2 [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
class Person{
	  public String name;
	  public float age;
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public Person(String name, float age) {
		
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
}
class Account{
	  public String accNum;
	  public double balance;
	  public Person accHolder;
	  
	  
	  public Account(Person p1,double balance ) {
		
		this.accNum = UUID.randomUUID().toString();
		this.balance = balance;
		this.accHolder = accHolder;
	}
	public void deposit(double amt)
	  {
		  balance +=amt;
	  }
	  @Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" +accHolder.name + " "+accHolder.name+"]";
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
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance()
	  {
		  return balance;
	  }
	  
}

