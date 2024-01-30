package PAC_Day4.Lab.age_exception;

public class Person {
	
		  public String name;
		  public float age;
		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}
		public Person(String name, float age) {
			
			this.name = name;
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public float getAge() {
			return age;
		}
		public void setAge(float age) {
			this.age = age;
		}
	}

