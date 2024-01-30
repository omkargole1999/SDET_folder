package Junit;

public class Employee {
	 private int id;
	 private String Fname;
	    private String Lname;
	    private double salary;
	    private String designation;
	    private String insuranceScheme;

	    // Constructors, getters, and setters


	   
		

		@Override
		public String toString() {
			return "Employee [id=" + id + ", Fname=" + Fname + ", Lname=" + Lname + ", salary=" + salary
					+ ", designation=" + designation + ", insuranceScheme=" + insuranceScheme + "]";
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFname() {
			return Fname;
		}

		public void setFname(String fname) {
			Fname = fname;
		}

		public String getLname() {
			return Lname;
		}

		public void setLname(String lname) {
			Lname = lname;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public String getInsuranceScheme() {
			return insuranceScheme;
		}

		public void setInsuranceScheme(String insuranceScheme) {
			this.insuranceScheme = insuranceScheme;
		}

}
