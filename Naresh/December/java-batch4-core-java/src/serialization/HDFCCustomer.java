package serialization;

import java.io.Serializable;

public class HDFCCustomer implements Serializable {
	
	private String customerId;
	
	private String customerName;
	
	private static String bankName="HDFC";
	
	public HDFCCustomer() {
		
	}

	public HDFCCustomer(String customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
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

	public static String getBankName() {
		return bankName;
	}

	public static void setBankName(String bankName) {
		HDFCCustomer.bankName = bankName;
	}

	@Override
	public String toString() {
		return "HDFCCustomer [customerId=" + customerId + ", customerName=" + customerName + "]";
	}
	
	

}
