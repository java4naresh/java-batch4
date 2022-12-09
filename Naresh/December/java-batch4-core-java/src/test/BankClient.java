package test;

import abstraction.Bank;
import abstraction.HDFCBank;
import abstraction.SBIBank;

public class BankClient {

	public static void main(String[] args) {
		Bank sbiBank = new SBIBank();
		sbiBank.homeLoan();
		sbiBank.personalLoan();
		sbiBank.goldLoan();
		
		Bank hdfcBank = new HDFCBank();
		hdfcBank.homeLoan();
		hdfcBank.personalLoan();
		hdfcBank.goldLoan();
	}

}
