package wrapperclasses;

public class CustomerWrapper {
	
	private Integer id;
	
	private Float amount;
	
	private Long accountNumber;
	
	private Double balance;
	
	private Character gender;
	
	private Boolean isPhysicallyDisabled;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public Boolean getIsPhysicallyDisabled() {
		return isPhysicallyDisabled;
	}

	public void setIsPhysicallyDisabled(Boolean isPhysicallyDisabled) {
		this.isPhysicallyDisabled = isPhysicallyDisabled;
	}

	@Override
	public String toString() {
		return "CustomerWrapper [id=" + id + ", amount=" + amount + ", accountNumber=" + accountNumber + ", balance="
				+ balance + ", gender=" + gender + ", isPhysicallyDisabled=" + isPhysicallyDisabled + "]";
	}
	
	

}
