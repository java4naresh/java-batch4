class Bank {
	String bankName;
        String branch;
	int branchId;
	String managerName;

    public Bank() { // default constructor or no param constructor
     System.out.println("no param constructor called");
    }

	public Bank(String name, String brch, int id, String mngrName) {//Param Constructor
	bankName = name;
	branch = brch;
	branchId = id;
       managerName = mngrName;
	}

	public Bank(String name, String brch, int id, String mngrName, String k) {
	
	}


	public static void main(String[] args) 
	{
		Bank bank = new Bank();// no param constructor calling
		System.out.println(bank.bankName+" "+ bank.branch+" "+bank.branchId+" "+bank.managerName);
		bank.bankName = "STATE BANK";
        bank.branch = "GNT";
        bank.branchId = 131;
        bank.managerName = "vasavi";
		System.out.println(bank.bankName+" "+ bank.branch+" "+bank.branchId+" "+bank.managerName);
        Bank bank2 = new Bank();
		System.out.println(bank2.bankName+" "+ bank2.branch+" "+bank2.branchId+" "+bank2.managerName);
		bank2.bankName = "ICICI";
        bank2.branch = "GNT";
        bank2.branchId = 174;
        bank2.managerName = "vasavi";
		System.out.println(bank2.bankName+" "+ bank2.branch+" "+bank2.branchId+" "+bank2.managerName);
		Bank bank3 = new Bank("HDFC", "GNT", 130, "vasavi");// param constructor calling
        System.out.println(bank3.bankName+" "+ bank3.branch+" "+bank3.branchId+" "+bank3.managerName);
	}
}

	
