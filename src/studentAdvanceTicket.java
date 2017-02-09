
public class studentAdvanceTicket extends advanceTicket {
	
	private int daysPrior;
	
	public studentAdvanceTicket (int number, int daysPrior) {
		super (number, daysPrior);
		this.daysPrior = daysPrior;
	}
	
	public double getPrice () {
		if (daysPrior > 9){
			return 15.0;
		}
		else {
			return 20.0;
		}
	}
}