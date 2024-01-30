package PAC_Day4;

import java.util.Scanner;



public class TC007_UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			emp e1 = new emp();
			e1.getempdetails();
			
		}
		catch(AgeException e) {
	System.out.println(e);
		

	}
	}
}
class AgeException extends Exception{
	   private int age;
	   
	   AgeException(int a)
	   {
		   age = a;
	   }
	   public String toString()
	   {
		   return age+"is an invalid age";
	   }
}
class emp
{
	String name;
	int age;
	void getempdetails() throws AgeException
	{
		System.out.println("Enter your name : ");
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		age = sc.nextInt();
		if(age < 16)
		{
			throw new AgeException(age);
		}
	}
}


