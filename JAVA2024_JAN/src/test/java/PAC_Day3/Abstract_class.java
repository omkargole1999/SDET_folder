package PAC_Day3;

public class Abstract_class {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect rectangle = new Rect();
		rectangle.draw();

	}

}
abstract class shapes{
	  abstract void draw();
}
class Rect extends shapes
{
	@Override
	void draw()
	{
		System.out.println("Draw the Rectangle");
	}
}
