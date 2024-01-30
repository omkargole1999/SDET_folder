package java_test2024;

public class TC002_Variables {
	private double dblwdth = 10.0;
	private double dblheight = 10.0;
	private double dbldepth = 10.0;
	
	private static int boxid ;
	
	
	
	public double voulme()
	{
		double deltemp;
		deltemp = dblwdth * dblheight * dbldepth;
		return deltemp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TC002_Variables obj = new TC002_Variables();
		double val;
		val = obj.voulme();
		System.out.println(val);
    System.out.println(TC002_Variables.boxid);
	}

}
