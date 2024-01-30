package PAC_Day3;

public class Overiding_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwipeMachine obj1 = new SwipeMachine();
		obj1.readCard();
		obj1 = new ChipCardMachine();
		obj1.readCard();
		
	}

}
class SwipeMachine{
	   void readCard()
	   {
		  System.out.println("This is swipemachine");
	   }
}

class ChipCardMachine extends SwipeMachine{
	@Override
	   void readCard() {
		   System.out.println("This is Chip card machine");
	   }
}

