package Test;

import Abstraction.KotakBank;
import Abstraction.RBI;
import Abstraction.SBIBank;

public class BankClient {
	
	public static void main (String[] args) {
		RBI sbibank = new SBIBank(710);
		sbibank.personalLoan();
		sbibank.vehiclelLoan();
		RBI kotakbank = new KotakBank(810);
		kotakbank.personalLoan();
		kotakbank.vehiclelLoan();
	}

}
