package Junit;



public class Employee_imp_class {
	

	Employee_imp_class(String first_name , String last_name) throws Exception

             {
           	    if(first_name == null && last_name != null)
           	    {
           	        throw new ExceptionCheck("first name is blank..!!");	
           	    }else if(first_name != null && last_name == null)
           	    {
           	    	throw new ExceptionCheck("Last name is blank..!!");
           	    }
           	    else if(first_name == null && last_name == null)
           	    {
           	    	throw new ExceptionCheck("Last name and first name both are blank..!!");
           	    }
             }
             

}

