

public class ticket {
	private double price;
	private int number;
	public ticket (int number) {
		this.number = number;
	}
	
	public double getPrice () {
		return price;
	}
	
	public void toString () {
		System.out.println (“ Number: ” + number + “Price: “ + price);
}

public class walkupTicket extends ticket {