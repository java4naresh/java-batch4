package abstraction;

public class HDFCBank implements Bank{

	@Override
	public void personalLoan() {
		double interestRate = 10.0;
		double gst = 1.0;
		double processingFee = 0.5;
		System.out.println("interestRate="+interestRate+" gst="+gst+" processingFee="+processingFee);
		
	}

	@Override
	public void homeLoan() {
		double interestRate = 8.5;
		double gst = 1.0;
		double processingFee = 0.5;
		System.out.println("interestRate="+interestRate+" gst="+gst+" processingFee="+processingFee);
		
	}

	@Override
	public void goldLoan() {
		double interestRate = 7.0;
		double gst = 1.0;
		double processingFee = 0.5;
		System.out.println("interestRate="+interestRate+" gst="+gst+" processingFee="+processingFee);
		
	}

}
