
public class Main {

	public static void main(String[] args) {

		PolymorphismExample e1 = new PolymorphismExample();
	    e1.sayName();
	    e1.sayHi();
	    
	    DogFood d1 = new DogFood();
	    	d1.setFlavor("Chocolate");
	    	System.out.println(d1.getFlavor());
	    	d1.closedBag();

	}

}
