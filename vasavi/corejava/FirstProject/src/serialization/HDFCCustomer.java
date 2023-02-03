package serialization;

import java.io.Serializable;
public class HDFCCustomer implements Serializable {
	

	private static final long serialVersionUID = 2;
	
	private String customerId;
	private String customerName;
	private static String bankName = "HDFC";
	private transient String password;
	
	public HDFCCustomer() {
		
	}
	
	
	public HDFCCustomer(String customerId, String customerName, String password) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.password = password;
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


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "HDFCCustomer [customerId=" + customerId + ", customerName=" + customerName + ", password=" + password
				+ "]";
	}
	
	

}
