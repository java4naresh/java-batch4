package collection;

import java.util.Objects;

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
		return Objects.equals(aadharNumber, other.aadharNumber) && Objects.equals(cin, other.cin)
				&& Objects.equals(customerName, other.customerName) && Objects.equals(panNumber, other.panNumber);
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
