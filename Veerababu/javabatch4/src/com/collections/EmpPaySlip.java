package com.collections;

public class EmpPaySlip {

	private int empId;

	private String empfristName;
	private String emplastName;

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
	private int empNodaysSalary;
	
	
	public EmpPaySlip(int empId, String empfristName, String emplastName, String month, int totalAnnualSalary,
			int basicSalary, int allowance, int monthlySalary, int taxDeducted, int salaryCredited, int ptax, int extra,
			int empDays, int empNodaysSalary) {
		super();
		this.empId = empId;
		this.empfristName = empfristName;
		this.emplastName = emplastName;
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
		this.empNodaysSalary = empNodaysSalary;
	}
	public EmpPaySlip() {
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + allowance;
		result = prime * result + basicSalary;
		result = prime * result + empDays;
		result = prime * result + empId;
		result = prime * result + empNodaysSalary;
		result = prime * result + ((empfristName == null) ? 0 : empfristName.hashCode());
		result = prime * result + ((emplastName == null) ? 0 : emplastName.hashCode());
		result = prime * result + extra;
		result = prime * result + ((month == null) ? 0 : month.hashCode());
		result = prime * result + monthlySalary;
		result = prime * result + ptax;
		result = prime * result + salaryCredited;
		result = prime * result + taxDeducted;
		result = prime * result + totalAnnualSalary;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpPaySlip other = (EmpPaySlip) obj;
		if (allowance != other.allowance)
			return false;
		if (basicSalary != other.basicSalary)
			return false;
		if (empDays != other.empDays)
			return false;
		if (empId != other.empId)
			return false;
		if (empNodaysSalary != other.empNodaysSalary)
			return false;
		if (empfristName == null) {
			if (other.empfristName != null)
				return false;
		} else if (!empfristName.equals(other.empfristName))
			return false;
		if (emplastName == null) {
			if (other.emplastName != null)
				return false;
		} else if (!emplastName.equals(other.emplastName))
			return false;
		if (extra != other.extra)
			return false;
		if (month == null) {
			if (other.month != null)
				return false;
		} else if (!month.equals(other.month))
			return false;
		if (monthlySalary != other.monthlySalary)
			return false;
		if (ptax != other.ptax)
			return false;
		if (salaryCredited != other.salaryCredited)
			return false;
		if (taxDeducted != other.taxDeducted)
			return false;
		if (totalAnnualSalary != other.totalAnnualSalary)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "EmpPaySlip [empId=" + empId + ", empfristName=" + empfristName + ", emplastName=" + emplastName
				+ ", month=" + month + ", totalAnnualSalary=" + totalAnnualSalary + ", basicSalary=" + basicSalary
				+ ", allowance=" + allowance + ", monthlySalary=" + monthlySalary + ", taxDeducted=" + taxDeducted
				+ ", salaryCredited=" + salaryCredited + ", ptax=" + ptax + ", extra=" + extra + ", empDays=" + empDays
				+ ", empNodaysSalary=" + empNodaysSalary + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpfristName() {
		return empfristName;
	}
	public void setEmpfristName(String empfristName) {
		this.empfristName = empfristName;
	}
	public String getEmplastName() {
		return emplastName;
	}
	public void setEmplastName(String emplastName) {
		this.emplastName = emplastName;
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
	public int getEmpNodaysSalary() {
		return empNodaysSalary;
	}
	public void setEmpNodaysSalary(int empNodaysSalary) {
		this.empNodaysSalary = empNodaysSalary;
	}
	

}
