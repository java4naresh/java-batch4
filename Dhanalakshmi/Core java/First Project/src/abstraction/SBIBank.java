package abstraction;

public class SBIBank implements Bank {

	public void personalLoan() {
		double interestRate = 10.5;
		double gst = 1.0;
		double processingFee = 1.0;
		System.out.println("interestRate="+interestRate+"gst="+gst+" processingFee="+processingFee);
	}

	public void studentLoan() {
		double interestRate = 8.2;
		double gst = 1.0;
		double processingFee = 1.0;
		System.out.println("interestRate="+interestRate+"gst="+gst+" processingFee="+processingFee);	
	}

	public void goldLoan() {
		double interestRate = 7.3;
		double gst = 1.0;
		double processingFee = 1.0;
		System.out.println("interestRate="+interestRate+"gst="+gst+" processingFee="+processingFee);
	}

}
