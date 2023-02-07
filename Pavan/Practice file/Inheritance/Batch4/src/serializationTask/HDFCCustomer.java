package serializationTask;

import java.io.Serializable;

public class HDFCCustomer extends HDFCBank implements Serializable {

	private static final long serialVersionUID = 1;
	private String customerId;
	private String customerName;
	private char gender;

	public HDFCCustomer(String accountType, String tansactionLimit, String customerId, String customerName,
			char gender) {
		super(accountType, tansactionLimit);
		this.customerId = customerId;
		this.customerName = customerName;
		this.gender = gender;

	}

	public HDFCCustomer(String customerId, String customerName, char gender) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.gender = gender;
	}

	public HDFCCustomer() {

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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "HDFCCustomer [customerId=" + customerId + ", customerName=" + customerName + ", gender=" + gender + "]";
	}

}
