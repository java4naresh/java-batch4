class HDFCCustomer 
{
	public static void main(String[] args) 
	{
		HDFCBank hdfcBank = new HDFCBank();
        System.out.println("HDFC BANK Personal Interest Rate: "+hdfcBank.getPersonalLoanInterestRate());
		System.out.println("HDFC BANK Home Interest Rate: "+hdfcBank.getHomeLoanInterestRate());

        RBI rbi = new RBI();
		rbi.getCreditCardInterestRate();
	}
}
