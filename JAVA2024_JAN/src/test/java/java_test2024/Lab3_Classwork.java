package java_test2024;

public class Lab3_Classwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.setFirst_name("Omkar");
		p1.setGender('M');
		p1.setLastName("Gole");
		System.out.println(p1.getFirst_name());
		System.out.println(p1.getGender());
		System.out.println(p1.getLastName());
		
		

	}

}
class Person
{
	private String first_name;
	private String lastName;
	private char gender;
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
}
