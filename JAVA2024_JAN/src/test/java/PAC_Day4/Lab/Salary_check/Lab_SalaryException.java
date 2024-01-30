package PAC_Day4.Lab.Salary_check;

import com.cg.eis.exception.EmployeException;

public class Lab_SalaryException {
	 Lab_SalaryException(double salary) throws EmployeException {
	        if (salary < 3000) {
	            throw new EmployeException("Salary cannot be below 3000");
	        }
	        // Continue with processing if salary is valid
	    }
	}

