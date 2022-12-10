package abstraction;

public class IndianBank implements Bank  {

	public void personalLoan() {
		double interestRate = 11.1;
		double gst = 1.0;
		double processingFee = 0.5;
		System.out.println("interestRate="+interestRate+"gst="+gst+" processingFee="+processingFee);
	}

	public void studentLoan() {
		double interestRate = 9.4;
		double gst = 1.0;
		double processingFee = 2.0;
		System.out.println("interestRate="+interestRate+"gst="+gst+" processingFee="+processingFee);	
	}

	public void goldLoan() {
		double interestRate = 12.5;
		double gst = 1.0;
		double processingFee = 3.0;
		System.out.println("interestRate="+interestRate+"gst="+gst+" processingFee="+processingFee);
	}

}
