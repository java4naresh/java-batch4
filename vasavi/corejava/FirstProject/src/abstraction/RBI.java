package abstraction;

public abstract class RBI {
	
	String manager;
	
	public RBI (String manager) {
		this.manager = manager;
	}
	
	
	
	public void personalLoan() {
		System.out.println("default Personal Loan = "+10.5);
	}
	
	public abstract void vehicleLoan();

}
