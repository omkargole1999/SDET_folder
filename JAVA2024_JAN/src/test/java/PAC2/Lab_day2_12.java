package PAC2;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Lab_day2_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.out.println("Enter the date1 in dd/mm/yyyy format");
				Scanner sc = new Scanner(System.in);
				String date = sc.nextLine();
			    LocalDate d1 = LocalDate.parse(date);
			    System.out.println("Enter the date2 in dd/mm/yyyy format");
			    String date2 = sc.nextLine();
			    LocalDate d2 = LocalDate.parse(date2);
			  
				
				Period p  = d2.until(d1);
				System.out.println("day :"+p.get(ChronoUnit.DAYS));
				System.out.println("months :"+p.get(ChronoUnit.MONTHS));
				System.out.println("years :"+p.get(ChronoUnit.YEARS));
				

	}

}
