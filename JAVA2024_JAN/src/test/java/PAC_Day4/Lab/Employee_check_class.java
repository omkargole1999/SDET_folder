package PAC_Day4.Lab;

 class Employee_check_class {

	     Employee_check_class(String first_name , String last_name) throws Employee_exception

              {
            	    if(first_name == null && last_name != null)
            	    {
            	        throw new Employee_exception("first name is blank..!!");	
            	    }else if(first_name != null && last_name == null)
            	    {
            	    	throw new Employee_exception("Last name is blank..!!");
            	    }
            	    else if(first_name == null && last_name == null)
            	    {
            	    	throw new Employee_exception("Last name and first name both are blank..!!");
            	    }
              }
              
 
}
