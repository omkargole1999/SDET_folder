package Junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Assert_test_date {
	@Test
	public void test1() {
      AllTests t1 = new AllTests(1,12,2023);
     assertEquals(1 ,t1.getDay());
     assertEquals(12 ,t1.getMonth());
     assertEquals(2023 ,t1.getYear());
    
          
}
	
	
	
}
