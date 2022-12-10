package abstraction;

public class SBIBank implements Bank{
	
	int cibilScore;
	
	public SBIBank(int cibilScore) {
		this.cibilScore = cibilScore;
	}

	@Override
	public void personalLoan() {
		double interestRate = 0;
		double gst = 1.0;
		double processingFee = 1.0;
		if(cibilScore < 700) {
			System.out.println("you are not eligible for personal loan due to cibil score");
		} else if(cibilScore > 700 && cibilScore < 750) {
			interestRate = 12.0;
			System.out.println("interestRate="+interestRate+" gst="+gst+" processingFee="+processingFee);
		} else if(cibilScore >= 750 && cibilScore < 800) {
			interestRate = 11.5;
			System.out.println("interestRate="+interestRate+" gst="+gst+" processingFee="+processingFee);
		} else if(cibilScore >= 800) {
			interestRate = 10.5;
			System.out.println("interestRate="+interestRate+" gst="+gst+" processingFee="+processingFee);
		}
		 
		
		
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
	
	public void vehicalLoan() {
		System.out.println("default vehicle loan interest is ="+8.5);
		
	}

}