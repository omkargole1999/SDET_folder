package PAC_Day3;

public class Box_Class {
	public Box_Class()
	{
		System.out.println("This is non parameterized constructor");
	}
	public Box_Class(String message)
	{
		System.out.println(message +"This is the parameterized constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box_Class obj1 = new Box_Class();
		Box_Class obj2 = new Box_Class("Parameter ");
		

	}

}
