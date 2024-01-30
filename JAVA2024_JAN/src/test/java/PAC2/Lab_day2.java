package PAC2;
import java.util.Scanner;
public class Lab_day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		
		  StringBuilder sb = new StringBuilder(str);
		
		
		System.out.println("Enter your choice");
		System.out.println("1.Add the string to itself");
		System.out.println("2.Replace odd positions with #");
		System.out.println("3.Remov duplicate characters in string");
		System.out.println("4.Change odd characters to upper case");
		int i= sc.nextInt();
				
		
	
			switch(i) {
			
			
			case 1:
				System.out.println("enter new string");
				String str1=sc.next();
				System.out.println(str.concat(str1));
				break;
			
			
			case 2:
				for(int j=0; j<str.length(); j++){
			        char ch= str.charAt(j);

			        if (j%2 != 0) {
			        	System.out.print(ch);
			        }else {
			        	ch='#';
			        	System.out.print(ch);
			        }
				 }
				break;
					
			case 3:
				for(int x=0; x<str.length(); x++) {
					char ch1 = str.charAt(x);
					boolean isDuplicate=false;
					for(int y=0;y<x;y++) {
						if(str.charAt(y)==ch1) {
							isDuplicate=true;
						}
					}
					if(!isDuplicate) {
						System.out.print(ch1);
					}
				}
				break;
				
			
			case 4:
				for(int j=0; j<str.length(); j++){
			        char ch= str.charAt(j);

			        if (j%2 != 0) {
			        	System.out.print(ch);
			        }else {
			        	System.out.print(Character.toUpperCase(ch));
			        }
				 }
				break;
				
				default:
					System.out.println("wrong choice");
					break;
			}
     
     
     }
	}

