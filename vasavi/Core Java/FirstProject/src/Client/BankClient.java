package client;

import abstraction.Bank;
import abstraction.HDFCBank;
import abstraction.SBIBank;

public class BankClient {

	public static void main(String[] args) {
		SBIBank sbiBank = new SBIBank();
		sbiBank.homeLoan();
		sbiBank.personalLoan();
		sbiBank.goldLoan();
		
		HDFCBank hdfcBank = new HDFCBank();
		hdfcBank.homeLoan();
		hdfcBank.personalLoan();
		hdfcBank.goldLoan();
		

	}

}
