package encapsulation;

public class Customer {
private int customerId;
	
	private String customerName;
	
	private int custAge;
	
	private long aadharNumber;
	private String phoneNumber;

	public Customer(int customerId, String customerName, int custAge, long aadharNumber, String phoneNumber) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.custAge = custAge;
		this.aadharNumber = aadharNumber;
		this.phoneNumber = phoneNumber;
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

	public long getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	
    public String getPhoneNumber(String phoneNumber) {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
    	this.phoneNumber = phoneNumber;
    }
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", custAge=" + custAge
				+ ", aadharNumber=" + aadharNumber + ", phoneNumber=" + phoneNumber + "]";
	}
 
    @Override	
	public boolean equals(Object obj) {
    	Customer cust = (Customer)obj;
		if(this.customerId == cust.getCustomerId()&& this.customerName.equals(cust.getCustomerName()) && this.custAge == cust.getCustAge() && this.aadharNumber == cust.getAadharNumber() && this.phoneNumber.equals(cust.getPhoneNumber(phoneNumber)))
			return true;
		else return false;
	}
}
