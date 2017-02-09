
public class advanceTicket extends ticket {
	private int daysPrior;
	
	public advanceTicket (int number, int daysPrior) {
		super(number);
		this.daysPrior = daysPrior;
	}
	public double getPrice () {
		if (daysPrior > 9){
			return 30.0;
		}
		else return 40.0;
	}
}
