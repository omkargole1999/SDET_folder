package PAC_Day4.Lab;

import com.cg.els.bean.Employee;
public class Exception_emp_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.setFname("pmkar");
		e1.setLname("Gole");
		try {
		 Employee_check_class ecl1 = new  Employee_check_class(e1.getFname() , e1.getLname());
		System.out.println("Employee first name :"+e1.getFname()+"    Employee last name : "+e1.getLname());
	
	}catch(Employee_exception exe)
		{
		
		  System.out.println(exe);
		}
	}
}
