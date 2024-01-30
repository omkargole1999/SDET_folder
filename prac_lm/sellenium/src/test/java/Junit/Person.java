package Junit;

import org.junit.Test;


public class Person {
   
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//     Person p = new Person(null ,null);
//     System.out.println(p.getFull_Name());
	private String fname;
	private String lname;
//		
//	}
	public Person(String fname, String lname) {
 		
 		this.fname = fname;
 		this.lname = lname;
 		
 	}
 	public String getFull_Name()
 	{
 		String first = (this.fname !=null)?this.fname : "?";
 		String last = (this.lname != null)?this.lname :"?";
 	
 		return first+" "+last;
 	}
 	

 	


 	public String getFname() {
 		return fname;
 	}
 	public void setFname(String fname) {
 		this.fname = fname;
 	}
 	public String getLname() {
 		return lname;
 	}
 	public void setLname(String lname) {
 		this.lname = lname;
 	}
		

	
	 	
	
	

}

