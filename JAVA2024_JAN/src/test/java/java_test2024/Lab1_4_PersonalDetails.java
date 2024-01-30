package java_test2024;

public class Lab1_4_PersonalDetails {
     private String First_Name = "Divya";
     private String Last_Name = "Bharathi";
     private char Gender = 'F';
     private int Age = 20;
     private double Weight = 85.55 ;
     
	public static void main(String[] args) {
		Lab1_4_PersonalDetails obj = new Lab1_4_PersonalDetails();
		System.out.println("Personal Details");
		System.out.println("__________________");
		System.out.println();
		System.out.println("First Name :"+obj.First_Name);
		System.out.println("Last Name :"+obj.Last_Name);
		System.out.println("Gender :"+obj.Gender);
		System.out.println("Age :"+obj.Age);
		System.out.println("Weight :"+obj.Weight);
		

	}

}
