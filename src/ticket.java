
public class ticket {
	
	private double price;
	private int number;
	
	public ticket (int number) {
		this.number = number;
	}
	
	
	
	public double getPrice () {
		
		return price;
	}
	
	public String toString () {
		return (" Number: " + this.number + " Price: " + getPrice());
	}
}


