package PAC_Day4;

public class TC004_multimple_try_catch {

	public static void main(String[] args) {
		int arr[] = {34,12,65,12};
	try{	// TODO Auto-generated method stub
	
	   for(int i = 0 ; i < arr.length ; i++)
	   {
		   System.out.println("number :"+arr[i]);
		   
	   }
	}catch(NullPointerException ex)
	{
		System.out.println(ex);
	}
	try {
		   for(int i = 0;i < arr.length - 1 ; i++)
		   {
			  int b =  4 / i;
		   }
	}catch(ArithmeticException er)
	{
		System.out.println(er);
	}
	}

}
