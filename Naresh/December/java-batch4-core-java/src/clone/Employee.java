package clone;

public class Employee {
	
	private String companyName;

	public Employee(String companyName) {
		super();
		this.companyName = companyName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Employee [companyName=" + companyName + "]";
	}
	
	
	
	
	

}
