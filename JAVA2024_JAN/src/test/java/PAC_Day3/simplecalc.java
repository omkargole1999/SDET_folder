package PAC_Day3;

 interface simplecalc {
	
		int add(int a , int b );
	
}
class calc implements simplecalc{
	 public int add(int a , int b)
	  {
		  return a+b;
	  }


public static void main(String [] args)
{
	calc cal = new calc();
  int val	= cal.add(10 , 10);
	System.out.println(val);
	
}
}
