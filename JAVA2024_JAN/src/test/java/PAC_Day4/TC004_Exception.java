package PAC_Day4;

public class TC004_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			  int a,b , c;
			  a = 23;
			  b = 0;
			  c = a / b;
			  System.out.println(c);
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex);
		}
		finally {
			   System.out.println("Thank you");
		}

	}

}
