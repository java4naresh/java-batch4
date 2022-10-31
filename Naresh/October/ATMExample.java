class ATMExample 
{
	public static void main(String[] args) 
	{
		int enteredPinNumber = 1234;
        int actualPinNumber = 1235;
		double availableBalance = 5000;
        double enteredWithdrawAmount = 4600;

		if(actualPinNumber == enteredPinNumber) {
		System.out.println("Welcome mr/miss Naresh");
		if(enteredWithdrawAmount <= availableBalance) {
              if(enteredWithdrawAmount % 100 == 0) {
			  System.out.println("Please take your amount");
			  System.out.println("Your available balance amount is="+(availableBalance - enteredWithdrawAmount));
			  } else {
			   System.err.println("Please enter 100's only");
			  }
		
		} else {
		System.err.println("Please enter lessthan available balance amount");
		}
		} else {
		System.err.println("Wrong PinNumber Please try again!");
		}
	}
}
