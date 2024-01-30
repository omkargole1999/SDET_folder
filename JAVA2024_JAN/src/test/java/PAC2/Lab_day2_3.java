package PAC2;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.Date;

public class Lab_day2_3 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.out.println("Enter the date in dd/mm/yyyy format");
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
	    LocalDate d = LocalDate.parse(date);
	   System.out.println("date : "+d);
		LocalDate d2 = LocalDate.now();
		System.out.println("current date :"+d2);
		Period p  = d.until(d2);
		System.out.println("day :"+p.get(ChronoUnit.DAYS));
		System.out.println("months :"+p.get(ChronoUnit.MONTHS));
		System.out.println("years :"+p.get(ChronoUnit.YEARS));
		

	}
	

	}


