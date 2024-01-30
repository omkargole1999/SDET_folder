package PAC_Day4.Lab.age_exception;

public class AgeCheckClass {
      AgeCheckClass(float age) throws InvalidAgeException
      {
    	    if(age <= 15)
    	    {
    	    	throw new InvalidAgeException("Age is invalid");
    	    }
      }
      
}
