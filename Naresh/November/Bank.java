class Bank 
{
	String bankName;
    String branch;
	int branchId;
	String managerName;


	public static void main(String[] args) 
	{
		Bank bank = new Bank();
		System.out.println(bank.bankName+" "+ bank.branch+" "+bank.branchId+" "+bank.managerName);
		bank.bankName = "HDFC";
        bank.branch = "KPHB";
        bank.branchId = 250;
        bank.managerName = "Naresh";
		System.out.println(bank.bankName+" "+ bank.branch+" "+bank.branchId+" "+bank.managerName);
        Bank bank2 = new Bank();
		System.out.println(bank2.bankName+" "+ bank2.branch+" "+bank2.branchId+" "+bank2.managerName);
		bank2.bankName = "ICICI";
        bank2.branch = "KPHB";
        bank2.branchId = 250;
        bank2.managerName = "Naresh";
		System.out.println(bank2.bankName+" "+ bank2.branch+" "+bank2.branchId+" "+bank2.managerName);
	}
}
