package PAC_Day4.Lab.Salary_check;

import com.cg.eis.exception.EmployeException;

public class Employe_salary_main {

	public static void main(String[] args) {
		  
		        try {
		        	Lab_SalaryException ls = new Lab_SalaryException(2500);  // Replace with the actual salary value
		            // Other operations with valid salary...
		        } catch (EmployeException e) {
		            System.out.println(e.getMessage());
		            // Handle the exception appropriately...
		                
		        }
		    }

}
