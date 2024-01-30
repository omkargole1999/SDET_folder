package PAC_Day3;

public class ClassWork_inheritance {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DerivedClass obj = new DerivedClass();
		

	}

}
class ParentClass{
	 public void basemethod1()
	 {
		 System.out.println("This is parent class");
	 }
}
class DerivedClass extends ParentClass{
	 public void basemethod2()
	 {
		 System.out.println("This is derived class");
	 }
}

