package java_test2024;

public class TC003_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i <= 5;i++)
		{
		switch(i)
		{
		case 0 : 
			System.out.println("i value is zero");
			break;
		case 1 : 
			System.out.println("i value is one");
			break;
		case 2 : 
			System.out.println("i value is two");
			break;
		case 3 : 
			System.out.println("i value is three");
			break;
		case 4 : 
			System.out.println("i value is four");
			break;
		case 5 : 
			System.out.println("i value is five");
			break;
			
			
		}
		}
		int n = 5;
		while(n > 0)
		{
			System.out.println("value of n = "+n);
			n--;
		}
		do {
			   System.out.println("value of n = "+n);
			   n--;
			   
		}while(n > 0);
	}

}
