package Junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Employe_testClass {
	@Test
        public void  test() throws Exception
        {
		// TODO Auto-generated method stub
				Employee e1 = new Employee();
				e1.setFname(null);
				e1.setLname("Gole");
				try {
				 Employee_imp_class ecl1 = new  Employee_imp_class(e1.getFname() , e1.getLname());
				System.out.println("Employee first name :"+e1.getFname()+"    Employee last name : "+e1.getLname());
			
			}catch(ExceptionCheck exe)
				{
				
				  System.out.println(exe);
				}
			}
        }

