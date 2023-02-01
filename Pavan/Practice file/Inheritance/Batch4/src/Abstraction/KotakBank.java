package Abstraction;

public class KotakBank extends RBI {

int cibilScore;
	
	public KotakBank(int cibilScore) {
		this.cibilScore = cibilScore;
	}	
	public void personalLoan() {
		double interestRate = 0;
		double gst = 1.0;
		double processingFee = 1.0;
		if(cibilScore < 700) {
			System.out.println("you are not eligible for personal loan due to cibil score");
		} else if(cibilScore > 700 && cibilScore < 750) {
			interestRate = 14.0;
			System.out.println("interestRate="+interestRate+" gst="+gst+" processingFee="+processingFee);
		} else if(cibilScore >= 750 && cibilScore < 800) {
			interestRate = 12.5;
			System.out.println("interestRate="+interestRate+" gst="+gst+" processingFee="+processingFee);
		} else if(cibilScore >= 800) {
			interestRate = 11.5;
			System.out.println("interestRate="+interestRate+" gst="+gst+" processingFee="+processingFee);
		}
		 
		
		
	}

	public void homeLoan() {
		double interestRate = 0;
		double gst = 1.0;
		double processingFee = 1.0;
		if(cibilScore < 700) {
			System.out.println("you are not eligible for home loan due to cibil score");
		} else if(cibilScore > 700 && cibilScore < 750) {
			interestRate = 15.0;
			System.out.println("interestRate="+interestRate+" gst="+gst+" processingFee="+processingFee);
		} else if(cibilScore >= 750 && cibilScore < 800) {
			interestRate = 12;
			System.out.println("interestRate="+interestRate+" gst="+gst+" processingFee="+processingFee);
		} else if(cibilScore >= 800) {
			interestRate = 10.5;
			System.out.println("interestRate="+interestRate+" gst="+gst+" processingFee="+processingFee);
		}
	}

	public void goldLoan() {
		double interestRate = 0;
		double gst = 1.0;
		double processingFee = 1.0;
		if(cibilScore < 700) {
			System.out.println("you are not eligible for gpld loan due to cibil score");
		} else if(cibilScore > 700 && cibilScore < 750) {
			interestRate = 12.0;
			System.out.println("interestRate="+interestRate+" gst="+gst+" processingFee="+processingFee);
		} else if(cibilScore >= 750 && cibilScore < 800) {
			interestRate = 10.5;
			System.out.println("interestRate="+interestRate+" gst="+gst+" processingFee="+processingFee);
		} else if(cibilScore >= 800) {
			interestRate = 10;
			System.out.println("interestRate="+interestRate+" gst="+gst+" processingFee="+processingFee);
		}
	}
	

}
