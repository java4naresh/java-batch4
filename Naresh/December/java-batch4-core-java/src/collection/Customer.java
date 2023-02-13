package collection;

public class Customer {
	
	private String customerName;
	
	private String cin;
	
	private String panNumber;
	
	private String aadharNumber;
	
	

	@Override
	public int hashCode() {
		return customerName.length();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (aadharNumber == null) {
			if (other.aadharNumber != null)
				return false;
		} else if (!aadharNumber.equals(other.aadharNumber))
			return false;
		if (cin == null) {
			if (other.cin != null)
				return false;
		} else if (!cin.equals(other.cin))
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (panNumber == null) {
			if (other.panNumber != null)
				return false;
		} else if (!panNumber.equals(other.panNumber))
			return false;
		return true;
	}

	public Customer(String customerName, String cin, String panNumber, String aadharNumber) {
		super();
		this.customerName = customerName;
		this.cin = cin;
		this.panNumber = panNumber;
		this.aadharNumber = aadharNumber;
	}

	public Customer() {
		super();
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", cin=" + cin + ", panNumber=" + panNumber
				+ ", aadharNumber=" + aadharNumber + "]";
	}
	
	

}
