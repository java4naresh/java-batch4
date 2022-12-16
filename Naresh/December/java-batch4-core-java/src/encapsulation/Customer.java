package encapsulation;

public class Customer {
	
	private int customerId;
	
	private String customerName;
	
	private int custAge;
	
	private long aadharNo;

	public Customer(int customerId, String customerName, int custAge, long aadharNo) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.custAge = custAge;
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

	public int getCustAge() {
		return custAge;
	}

	public void setCustAge(int custAge) {
		this.custAge = custAge;
	}

	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", custAge=" + custAge
				+ ", aadharNo=" + aadharNo + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Customer cust = (Customer)obj;
		if(this.aadharNo == cust.getAadharNo() && this.customerId == cust.getCustomerId() && this.customerName.equals(cust.getCustomerName()))
			return true;
		else return false;
	}
	
	/*@Override
	public int hashCode() {
		return (int)(customerId+aadharNo);
	}*/
	

}
