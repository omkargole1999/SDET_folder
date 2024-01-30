package java_test2024;
import java.util.Scanner;
public class Lab2_classwork {
  private int num ;
  
  public Lab2_classwork()
  {
	  System.out.println("Enter the numbers");
	  Scanner in = new Scanner(System.in);
	  int num = in.nextInt();
	  if(num > 0)
		  System.out.println("number is positive");
	  
	  else if(num == 0)
		  System.out.println("Number is zero");
	  else
		  System.out.println("Number is negative");
	  
  }
  
  
	public static void main(String[] args) {
		Lab2_classwork obj1 = new Lab2_classwork();
		

	}

}
