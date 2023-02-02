package serialization;

import java.io.Serializable;

public class KotakCustomer implements Serializable {
	private String customerId;
	private String customerName;
	private String phoneNumber;
	static private String bankName = "Kotak";

	public KotakCustomer(String customerId, String customerName, String phoneNumber) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
	}

	public KotakCustomer() {

	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static String getBankName() {
		return bankName;
	}

	public static void setBankName(String bankName) {
		KotakCustomer.bankName = bankName;
	}

	@Override
	public String toString() {
		return "KotakCustomer [customerId=" + customerId + ", customerName=" + customerName + ", phoneNumber="
				+ phoneNumber + "]";
	}

}
