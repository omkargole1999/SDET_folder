package PAC_Day4.Lab.age_exception;

public class AgeException_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Omkar" , 20.54f);
		try {
			AgeCheckClass c1 = new AgeCheckClass(p1.getAge());
			System.out.println("Name :"+p1.getName()+ " Age :"+p1.getAge());
		} catch (InvalidAgeException e) {
			System.out.println(e);
			// TODO Auto-generated catch block
			
		}
		
	}

}
