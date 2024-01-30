package PAC2;

public class Balanced_class {
	  String name;
	  double bal;
	  
        public Balanced_class(String n, double b )
        {
        	name = n;
        	bal = b;
        	
        }
        public void showbalance()
        {
        	if(bal > 0)
        	{
        		System.out.println("balance of "+name+"$"+bal);
        	}
        }
}
