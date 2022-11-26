class RBI 
{
	public double getPersonalLoanInterestRate() {
		return 10.5;
	}

	public double getHomeLoanInterestRate() {
		return 8.5;
	}
	
}

class HDFCBank extends RBI
{
	public double getCreditCardInterestRate() {
		return 13.5;
	}

	public double getJumboLoanInterestRate() {
		return 15.5;
	}

	public int getSavingsAccountMinimumBalance() {
		return 1000;
	}
}
