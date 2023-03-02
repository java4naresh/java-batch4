package collections;

public class EmpPaySlip {
	
	private int empId;
	
	private String empFirstName;
	
	private String empLastTime;
	
	private String month;
	
	private int totalAnnualSalary;
	
	private int basicSalary;
	
	private int allowance;
	
	private int monthlySalary;
	
	private int taxDeducted;
	
	private int salaryCredited;
	
	private int ptax;
	
	private int extra;
	
	private int totalWorkingDays;
	
	private int perDaySalary;

	

	public EmpPaySlip(int empId, String empFirstName, String empLastTime, String month, int totalAnnualSalary,
			int basicSalary, int allowance, int monthlySalary, int taxDeducted, int salaryCredited, int ptax, int extra,
			int totalWorkingDays, int perDaySalary) {
		super();
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastTime = empLastTime;
		this.month = month;
		this.totalAnnualSalary = totalAnnualSalary;
		this.basicSalary = basicSalary;
		this.allowance = allowance;
		this.monthlySalary = monthlySalary;
		this.taxDeducted = taxDeducted;
		this.salaryCredited = salaryCredited;
		this.ptax = ptax;
		this.extra = extra;
		this.totalWorkingDays = totalWorkingDays;
		this.perDaySalary = perDaySalary;
	}
	
	
	public EmpPaySlip() {
		
		super();
		
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpFirstName() {
		return empFirstName;
	}


	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}


	public String getEmpLastTime() {
		return empLastTime;
	}


	public void setEmpLastTime(String empLastTime) {
		this.empLastTime = empLastTime;
	}


	public String getMonth() {
		return month;
	}


	public void setMonth(String month) {
		this.month = month;
	}


	public int getTotalAnnualSalary() {
		return totalAnnualSalary;
	}


	public void setTotalAnnualSalary(int totalAnnualSalary) {
		this.totalAnnualSalary = totalAnnualSalary;
	}


	public int getBasicSalary() {
		return basicSalary;
	}


	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}


	public int getAllowance() {
		return allowance;
	}


	public void setAllowance(int allowance) {
		this.allowance = allowance;
	}


	public int getMonthlySalary() {
		return monthlySalary;
	}


	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}


	public int getTaxDeducted() {
		return taxDeducted;
	}


	public void setTaxDeducted(int taxDeducted) {
		this.taxDeducted = taxDeducted;
	}


	public int getSalaryCredited() {
		return salaryCredited;
	}


	public void setSalaryCredited(int salaryCredited) {
		this.salaryCredited = salaryCredited;
	}


	public int getPtax() {
		return ptax;
	}


	public void setPtax(int ptax) {
		this.ptax = ptax;
	}


	public int getExtra() {
		return extra;
	}


	public void setExtra(int extra) {
		this.extra = extra;
	}


	public int getTotalWorkingDays() {
		return totalWorkingDays;
	}


	public void setTotalWorkingDays(int totalWorkingDays) {
		this.totalWorkingDays = totalWorkingDays;
	}


	public int getPerDaySalary() {
		return perDaySalary;
	}


	public void setPerDaySalary(int perDaySalary) {
		this.perDaySalary = perDaySalary;
	}


	@Override
	public String toString() {
		return "EmpPaySlip [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastTime=" + empLastTime
				+ ", month=" + month + ", totalAnnualSalary=" + totalAnnualSalary + ", basicSalary=" + basicSalary
				+ ", allowance=" + allowance + ", monthlySalary=" + monthlySalary + ", taxDeducted=" + taxDeducted
				+ ", salaryCredited=" + salaryCredited + ", ptax=" + ptax + ", extra=" + extra + ", totalWorkingDays="
				+ totalWorkingDays + ", perDaySalary=" + perDaySalary + "]";
	}
	
	

}

	
