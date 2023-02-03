package serializationTask;

public class KotakBankCustomer extends KotakBank {

	/**
	 * 
	 */
	// private static final long serialVersionUID = 2;
	private String customerId;
	private String customerName;
	private char gender;
	private transient String password;

	public KotakBankCustomer(String accountType, String tansactionLimit, String customerId, String customerName,
			char gender, String password) {
		super(accountType, tansactionLimit);
		this.customerId = customerId;
		this.customerName = customerName;
		this.gender = gender;
		this.password = password;

	}

	public KotakBankCustomer() {
		super();
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "KotakBankCustomer [customerId=" + customerId + ", customerName=" + customerName + ", gender=" + gender
				+ ", password=" + password + "]";
	}

}

/*
 * package serialization;
 * 
 * public class HDFCBankCustomer extends HDFCCustomer {
 * 
 * private String products;
 * 
 * public HDFCBankCustomer() { super(); }
 * 
 * public HDFCBankCustomer(String products) { super(); this.products = products;
 * }
 * 
 * public String getProducts() { return products; }
 * 
 * public void setProducts(String products) { this.products = products; }
 * 
 * @Override public String toString() { return "HDFCBankCustomer [products=" +
 * products + "]"; }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 */
