package Assignment_lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lab4_assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr1 = new ArrayList();
		arr1.add("product3");
		arr1.add("product1");
		arr1.add("product2");
		arr1.add("product4");
		for(Object product : arr1)
	    {
	    	System.out.println(product);
	    }
		System.out.println("----------");
		
	    Collections.sort(arr1);
	    for(Object product : arr1)
	    {
	    	System.out.println(product);
	    }
	   

	}

}
