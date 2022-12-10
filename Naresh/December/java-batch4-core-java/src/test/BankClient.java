package test;

import abstraction.Bank;
import abstraction.HDFCBank;
import abstraction.SBIBank;

public class BankClient {

	public static void main(String[] args) {
		Bank sbiBank = new SBIBank(710);
		//sbiBank.homeLoan();
		sbiBank.personalLoan();
		//sbiBank.goldLoan();
		SBIBank sbiBank2 = new SBIBank(850);
		sbiBank2.personalLoan();
		sbiBank2.vehicalLoan();
		
		/*Bank hdfcBank = new HDFCBank();
		hdfcBank.homeLoan();
		hdfcBank.personalLoan();
		hdfcBank.goldLoan();*/
	}

}
