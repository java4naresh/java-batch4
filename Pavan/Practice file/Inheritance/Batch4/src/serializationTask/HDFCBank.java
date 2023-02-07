package serializationTask;

public class HDFCBank {
	private String accountType;
	private String tansactionLimit;
	static private String bank = "HDFC";

	public HDFCBank() {
		super();
	}

	public HDFCBank(String accountType, String tansactionLimit) {
		super();
		this.accountType = accountType;
		this.tansactionLimit = tansactionLimit;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getTansactionLimit() {
		return tansactionLimit;
	}

	public void setTansactionLimit(String tansactionLimit) {
		this.tansactionLimit = tansactionLimit;
	}

	public static String getBank() {
		return bank;
	}

	public static void setBank(String bank) {
		HDFCBank.bank = bank;
	}

	@Override
	public String toString() {
		return "HDFCBank [accountType=" + accountType + ", tansactionLimit=" + tansactionLimit + "]";
	}

}
