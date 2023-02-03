package serialization;

import java.io.Serializable;

public class SBIBank implements Serializable {

	private String customerName;
	private int customerAccountNumber;
	private String customerId;
	static private String bankName = "SBi Bank";

	public SBIBank() {

	}

	public SBIBank(String customerName, int customerAccountNumber, String customerId) {
		super();
		this.customerName = customerName;
		this.customerAccountNumber = customerAccountNumber;
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerAccountNumber() {
		return customerAccountNumber;
	}

	public void setCustomerAccountNumber(int customerAccountNumber) {
		this.customerAccountNumber = customerAccountNumber;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public static String getBankName() {
		return bankName;
	}

	public static void setBankName(String bankName) {
		SBIBank.bankName = bankName;
	}

	@Override
	public String toString() {
		return "SBIBank [customerName=" + customerName + ", customerAccountNumber=" + customerAccountNumber
				+ ", customerId=" + customerId + "]";
	}

}
