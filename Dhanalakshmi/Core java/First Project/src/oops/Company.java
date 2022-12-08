package oops;

public class Company {

	public String companyName;
	public Office office;
	
	public Company(String companyName,Office office) {
		this.companyName = companyName;
		this.office = office;
		
	}
	
	public Office getOffice() {
		return this.office;
		
	}
	
}
