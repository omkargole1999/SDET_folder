package PAC2;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Lab_day2_13 {
	LocalDate Manf_Date;
	LocalDate Exp_date;
	 Scanner sc = new Scanner(System.in);
	 public void create_manf_date()
	 {
		 String date_1 = sc.nextLine(); 
		 Manf_Date = LocalDate.parse(date_1);
	
			LocalDate exdate = Manf_Date.plusMonths(12);
			System.out.println("Expiry date : "+exdate);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	}

}
