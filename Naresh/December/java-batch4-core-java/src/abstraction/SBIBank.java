package abstraction;

public class SBIBank implements Bank{

	@Override
	public void personalLoan() {
		double interestRate = 10.5;
		double gst = 1.0;
		double processingFee = 1.0;
		System.out.println("interestRate="+interestRate+" gst="+gst+" processingFee="+processingFee);
		
	}

	@Override
	public void homeLoan() {
		double interestRate = 8.7;
		double gst = 1.0;
		double processingFee = 1.0;
		System.out.println("interestRate="+interestRate+" gst="+gst+" processingFee="+processingFee);
	}

	@Override
	public void goldLoan() {
		double interestRate = 7.7;
		double gst = 1.0;
		double processingFee = 1.0;
		System.out.println("interestRate="+interestRate+" gst="+gst+" processingFee="+processingFee);
		
	}

}
