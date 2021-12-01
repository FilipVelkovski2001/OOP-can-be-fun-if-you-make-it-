
public class DogFood implements InterfaceExample {
	
	private String flavor;
	
	public void openBag() {
		System.out.println("Bag is opened!");
			
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	
	}

	public String getFlavor() {
		
		return this.flavor;
		
	}
	@Override
	public void closedBag() {
		System.out.println("Bag is closed!");
		
	}
	

}
