package Jan25_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class testNG_priority {
      @Test(groups = {"sanity"} , priority = 4)      
	public void test1()
	{
		System.out.println("This is test 1");
	}
      @Test(groups = {"sanity"} , priority = 3)
	public void test2()
	{
		System.out.println("This is test 2");
	}
      @Test(priority = 3)
	public void test3()
	{
		System.out.println("This is test 3");
	}
}
