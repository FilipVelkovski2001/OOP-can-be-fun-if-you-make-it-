
public class PolymorphismExample extends InheritanceExample {

	String name;
	
	public void sayName() {
		System.out.println("My name!");
		
	}
	
	public void sayName(String name) {
		System.out.println("My name is "+ name);
		
	}
	
	public void sayName(String name, String surname) {
		System.out.println("My name is "+ name + "My surname is: "+ surname);
		
	}
	
	public void sayHi() {
		System.out.println("Diffent hi!");
		
	}
	
	



}
