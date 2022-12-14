package encapsulation;

public class Customer {
	
	private int customerId;
	
	private String customerName;
	
	private int custoAge;
	
	private long aadharNo;

	public Customer(int customerId, String customerName, int custoAge, long aadharNo) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.custoAge = custoAge;
		this.aadharNo = aadharNo;
	}
	
	public Customer() {
		 
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustoAge() {
		return custoAge;
	}

	public void setCustoAge(int custoAge) {
		this.custoAge = custoAge;
	}

	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", custoAge=" + custoAge
				+ ", aadharNo=" + aadharNo + "]";
	}
	
	

}
