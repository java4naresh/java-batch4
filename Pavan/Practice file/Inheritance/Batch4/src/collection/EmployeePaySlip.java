package collection;

public class EmployeePaySlip {

	private int empId;

	private String empName;

	private String month;

	private int totalAnnualSalary;

	private int basicSalary;

	private int allowance;

	private int monthlySalary;

	private int taxDeducted;

	private int salaryCredited;

	private int ptax;

	private int extra;

	public EmployeePaySlip(int empId, String empName, String month, int totalAnnualSalary, int basicSalary,
			int allowance, int monthlySalary, int taxDeducted, int salaryCredited, int ptax, int extra) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.month = month;
		this.totalAnnualSalary = totalAnnualSalary;
		this.basicSalary = basicSalary;
		this.allowance = allowance;
		this.monthlySalary = monthlySalary;
		this.taxDeducted = taxDeducted;
		this.salaryCredited = salaryCredited;
		this.ptax = ptax;
		this.extra = extra;
	}

	public EmployeePaySlip() {
		super();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getTotalAnnnualSalary() {
		return totalAnnualSalary;
	}

	public void setTotalAnnnualSalary(int totalAnnnualSalary) {
		this.totalAnnualSalary = totalAnnnualSalary;
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

	@Override
	public String toString() {
		return "EmployeePaySlip [empId=" + empId + ", empName=" + empName + ", month=" + month + ", totalAnnualSalary="
				+ totalAnnualSalary + ", basicSalary=" + basicSalary + ", allowance=" + allowance + ", monthlySalary="
				+ monthlySalary + ", taxDeducted=" + taxDeducted + ", salaryCredited=" + salaryCredited + ", ptax="
				+ ptax + ", extra=" + extra + "]";
	}

}
