package abstraction;

public class SBIBank implements Bank {

int cibilScore;
	
	public SBIBank(int cibilScore) {
		this.cibilScore = cibilScore;
	}
	public void personalLoan() {
		double interestRate = 0;
		double gst = 1.0;
		double processingFee = 1.0;
		if(cibilScore < 700) {
			System.out.println("You are not eligible for pesonal loan due to cibilScore");
		} else if (cibilScore > 700 && cibilScore < 750) {
			interestRate = 12.0;
			System.out.println("interestRate="+interestRate+"gst="+gst+" processingFee="+processingFee);
		} else if(cibilScore >= 750 && cibilScore < 800) {
			interestRate = 11.5;
			System.out.println("interestRate="+interestRate+"gst="+gst+" processingFee="+processingFee);
		} else if(cibilScore >= 800) {
			interestRate = 10.5;
			System.out.println("interestRate="+interestRate+"gst="+gst+" processingFee="+processingFee);
		}
		
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
		
	public void vehicalLoan() {
		System.out.println("default vehical loan interest is ="+8.5 );
	}
}
