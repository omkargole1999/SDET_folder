package PAC_Day4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TC005_Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str1 = "welcome";
//		String pattern = "Welcome";
//		boolean patternmatch = Pattern.matches(str1, pattern);
//       System.out.println("Matching "+patternmatch);
//       String input = "Shop , Mop ,Hopping ,Chopping";
//       Pattern p1 = Pattern.compile("op");
//       Matcher m1 = p1.matcher(input);
//       System.out.println(m1.matches());
//       while(m1.find())
//       {
//    	   System.out.println(m1.group()+ " : "+m1.start()+" : "+m1.end());
//       }
//       String s1 = "Welcome to Amazon 12345";
//       Pattern p2 = Pattern.compile("^[A-Z].*");
//       Matcher m2 = p2.matcher(s1);
//      if(m2.find()) {
//    	   System.out.println("Pattern matchd");
//    	   
//      }
//      else
//    	  System.out.println("Pattern not matched");
//	}
//	String n1 = "0123456789";
//	String s1 = "Welcome to Amazon 12345";
//	String s2 = "ogole111@gmail.com";
//	Pattern p2 = Pattern.compile("^[A-Z].*[0-9]$");
//	Pattern p3 = Pattern.compile("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]");
//	Pattern p4 = Pattern.compile("^[.+]@(\\S+)$");
//	Matcher m2 = p2.matcher(s1);
//	Matcher m3 = p3.matcher(n1);
//	Matcher m4 = p4.matcher(s2);
		String addhar = "1234 1234 1234";
		Pattern p1 = Pattern.compile("^[0-9][0-9][0-9][0-9]\\s[0-9][0-9][0-9][0-9]\\s[0-9][0-9][0-9][0-9]$");
		Matcher m1 = p1.matcher(addhar);
	
	if(m1.find())
	{
		System.out.println(" pattern matched");
	}
	else
	{
		System.out.println(" Pattern not matched");
	}
	
	
}
}
