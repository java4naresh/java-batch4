package collection;

import java.util.Objects;

public class EmployeePaySlip1 {
	private int empId;

	private String empFristName;
	private String empLastName;

	private String month;

	private int totalAnnualSalary;

	private int basicSalary;

	private int allowance;

	private int monthlySalary;

	private int taxDeducted;

	private int salaryCredited;

	private int ptax;

	private int extra;
	private int empDays;
	private int empNoDaysSalary;

	public EmployeePaySlip1(int empId, String empFristName, String empLastName, String month, int totalAnnualSalary,
			int basicSalary, int allowance, int monthlySalary, int taxDeducted, int salaryCredited, int ptax, int extra,
			int empDays, int empNoDaysSalary) {
		super();
		this.empId = empId;
		this.empFristName = empFristName;
		this.empLastName = empLastName;
		this.month = month;
		this.totalAnnualSalary = totalAnnualSalary;
		this.basicSalary = basicSalary;
		this.allowance = allowance;
		this.monthlySalary = monthlySalary;
		this.taxDeducted = taxDeducted;
		this.salaryCredited = salaryCredited;
		this.ptax = ptax;
		this.extra = extra;
		this.empDays = empDays;
		this.empNoDaysSalary = empNoDaysSalary;
	}

	public EmployeePaySlip1() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(allowance, basicSalary, empDays, empFristName, empId, empLastName, empNoDaysSalary, extra,
				month, monthlySalary, ptax, salaryCredited, taxDeducted, totalAnnualSalary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeePaySlip1 other = (EmployeePaySlip1) obj;
		return allowance == other.allowance && basicSalary == other.basicSalary && empDays == other.empDays
				&& Objects.equals(empFristName, other.empFristName) && empId == other.empId
				&& Objects.equals(empLastName, other.empLastName) && empNoDaysSalary == other.empNoDaysSalary
				&& extra == other.extra && Objects.equals(month, other.month) && monthlySalary == other.monthlySalary
				&& ptax == other.ptax && salaryCredited == other.salaryCredited && taxDeducted == other.taxDeducted
				&& totalAnnualSalary == other.totalAnnualSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpFristName() {
		return empFristName;
	}

	public void setEmpFristName(String empFristName) {
		this.empFristName = empFristName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
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

	public int getEmpDays() {
		return empDays;
	}

	public void setEmpDays(int empDays) {
		this.empDays = empDays;
	}

	public int getEmpNoDaysSalary() {
		return empNoDaysSalary;
	}

	public void setEmpNoDaysSalary(int empNoDaysSalary) {
		this.empNoDaysSalary = empNoDaysSalary;
	}

	@Override
	public String toString() {
		return "EmployeePaySlip1 [empId=" + empId + ", empFristName=" + empFristName + ", empLastName=" + empLastName
				+ ", month=" + month + ", totalAnnualSalary=" + totalAnnualSalary + ", basicSalary=" + basicSalary
				+ ", allowance=" + allowance + ", monthlySalary=" + monthlySalary + ", taxDeducted=" + taxDeducted
				+ ", salaryCredited=" + salaryCredited + ", ptax=" + ptax + ", extra=" + extra + ", empDays=" + empDays
				+ ", empNoDaysSalary=" + empNoDaysSalary + "]";
	}

}
