package java_test2024;
import java.util.Scanner;
public class Lab4_classwork {
	   private String First_Name;
	     private String Last_Name;
	     private char Gender ;
	     private int Age;
	     private double Weight;
	     private String mobile_no;
         private static int count = 2;
	public Lab4_classwork(String first_Name, String last_Name, char gender, int age, double weight ,String mobile) {
		
		First_Name = first_Name;
		Last_Name = last_Name;
		Gender = gender;
		Age = age;
		Weight = weight;
		mobile_no = mobile;
	}
    static void change_count()
    {
    	count += count * 2;
    	System.out.println("count is  : "+count);
    }


public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String mobile = sc.nextLine();
	Lab4_classwork obj = new Lab4_classwork("Divya" , "Bharati" , 'F',20,85.55 , mobile);
	System.out.println("Personal Details");
	System.out.println("__________________");
	System.out.println();
	System.out.println("First Name :"+obj.First_Name);
	System.out.println("Last Name :"+obj.Last_Name);
	System.out.println("Gender :"+obj.Gender);
	System.out.println("Age :"+obj.Age);
	System.out.println("Weight :"+obj.Weight);
	System.out.println("mobile number : "+obj.mobile_no);
	Lab4_classwork.change_count();
}
}
