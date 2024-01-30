package PAC2;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class Lab_day2_age {

	
		// TODO Auto-generated method stub
		 public static void main(String[] args) {
				LocalDate date1= LocalDate.now();
				
				DateTimeFormatter formatter=new DateTimeFormatterBuilder().parseCaseInsensitive()
			            .append(DateTimeFormatter.ofPattern("yyyy-MM-dd")).toFormatter();
				
			Scanner sc= new Scanner(System.in);
		    System.out.println("Enter your DOB in yyyy-MM-dd");
		    String dateofbirth=sc.nextLine();
				
				//String dateofbirth="2000-Dec-20";
				System.out.println("You entered:"+dateofbirth);
				System.out.println();
				LocalDate d1=  LocalDate.parse(dateofbirth,formatter);
				
				
				Period p1= date1.until(d1);
				System.out.println();
				System.out.println("Days: "+p1.get(ChronoUnit.DAYS));   //Enum ChronoUnit. A standard set of date periods units.
				System.out.println("Months: "+p1.get(ChronoUnit.MONTHS));
				System.out.println("Years: "+p1.get(ChronoUnit.YEARS));
				
}
}
