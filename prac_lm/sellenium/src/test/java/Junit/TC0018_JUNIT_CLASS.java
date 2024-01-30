package Junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TC0018_JUNIT_CLASS {
	@Test
	public void test2() {
		 Person p = new Person("Omkar" ,"Gole");
	     System.out.println(p.getFull_Name());
	     assertEquals("Omkar Gole" , p.getFull_Name());
	     
	}
	

	
}
