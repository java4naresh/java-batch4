package serializationTask;

import java.io.Serializable;

public class KotakBank implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2;
	private String accountType;
	private String tansactionLimit;
	static private String bank = "Kotak";

	public KotakBank() {
		super();
	}

	public KotakBank(String accountType, String tansactionLimit) {
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
		KotakBank.bank = bank;
	}

	@Override
	public String toString() {
		return "KotakBank [accountType=" + accountType + ", tansactionLimit=" + tansactionLimit + "]";
	}

}
/*
 * package serialization;
 * 
 * import java.io.Serializable;
 * 
 * public class HDFCCustomer implements Serializable {
 * 
 * 
 * 
 * /**
 * 
 */
/*
 * private static final long serialVersionUID = 2;
 * 
 * private String customerId;
 * 
 * private String customerName;
 * 
 * private transient String password;
 * 
 * private static String bankName="HDFC";
 * 
 * public HDFCCustomer() {
 * 
 * }
 * 
 * public HDFCCustomer(String customerId, String customerName, String password)
 * { super(); this.customerId = customerId; this.customerName = customerName;
 * this.password = password; }
 * 
 * public String getCustomerId() { return customerId; }
 * 
 * public void setCustomerId(String customerId) { this.customerId = customerId;
 * }
 * 
 * public String getCustomerName() { return customerName; }
 * 
 * public void setCustomerName(String customerName) { this.customerName =
 * customerName; }
 * 
 * public static String getBankName() { return bankName; }
 * 
 * public static void setBankName(String bankName) { HDFCCustomer.bankName =
 * bankName; }
 * 
 * 
 * 
 * public String getPassword() { return password; }
 * 
 * public void setPassword(String password) { this.password = password; }
 * 
 * @Override public String toString() { return "HDFCCustomer [customerId=" +
 * customerId + ", customerName=" + customerName + ", password=" + password +
 * "]"; }
 * 
 * }
 */
