package com.collections;

public class EmplyePaySlip {
	private String EmpName;
	private String Month;
	private Double totalanuallsalary;
	private Double basicsalary;
	private Double allowance;
	private Double monthlysalary;
	private Double tax_deducted;
	private Double salarycredited;
	private Double ptax;
	private Double extra;
	
	
	public EmplyePaySlip(String empName, String month, Double totalanuallsalary, Double basicsalary, Double allowance,
			Double monthlysalary, Double tax_deducted, Double salarycredited, Double ptax, Double extra) {
		super();
		EmpName = empName;
		Month = month;
		this.totalanuallsalary = totalanuallsalary;
		this.basicsalary = basicsalary;
		this.allowance = allowance;
		this.monthlysalary = monthlysalary;
		this.tax_deducted = tax_deducted;
		this.salarycredited = salarycredited;
		this.ptax = ptax;
		this.extra = extra;
	}
	public EmplyePaySlip() {
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((EmpName == null) ? 0 : EmpName.hashCode());
		result = prime * result + ((Month == null) ? 0 : Month.hashCode());
		result = prime * result + ((allowance == null) ? 0 : allowance.hashCode());
		result = prime * result + ((basicsalary == null) ? 0 : basicsalary.hashCode());
		result = prime * result + ((extra == null) ? 0 : extra.hashCode());
		result = prime * result + ((monthlysalary == null) ? 0 : monthlysalary.hashCode());
		result = prime * result + ((ptax == null) ? 0 : ptax.hashCode());
		result = prime * result + ((salarycredited == null) ? 0 : salarycredited.hashCode());
		result = prime * result + ((tax_deducted == null) ? 0 : tax_deducted.hashCode());
		result = prime * result + ((totalanuallsalary == null) ? 0 : totalanuallsalary.hashCode());
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
		EmplyePaySlip other = (EmplyePaySlip) obj;
		if (EmpName == null) {
			if (other.EmpName != null)
				return false;
		} else if (!EmpName.equals(other.EmpName))
			return false;
		if (Month == null) {
			if (other.Month != null)
				return false;
		} else if (!Month.equals(other.Month))
			return false;
		if (allowance == null) {
			if (other.allowance != null)
				return false;
		} else if (!allowance.equals(other.allowance))
			return false;
		if (basicsalary == null) {
			if (other.basicsalary != null)
				return false;
		} else if (!basicsalary.equals(other.basicsalary))
			return false;
		if (extra == null) {
			if (other.extra != null)
				return false;
		} else if (!extra.equals(other.extra))
			return false;
		if (monthlysalary == null) {
			if (other.monthlysalary != null)
				return false;
		} else if (!monthlysalary.equals(other.monthlysalary))
			return false;
		if (ptax == null) {
			if (other.ptax != null)
				return false;
		} else if (!ptax.equals(other.ptax))
			return false;
		if (salarycredited == null) {
			if (other.salarycredited != null)
				return false;
		} else if (!salarycredited.equals(other.salarycredited))
			return false;
		if (tax_deducted == null) {
			if (other.tax_deducted != null)
				return false;
		} else if (!tax_deducted.equals(other.tax_deducted))
			return false;
		if (totalanuallsalary == null) {
			if (other.totalanuallsalary != null)
				return false;
		} else if (!totalanuallsalary.equals(other.totalanuallsalary))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "EmplyePaySlip [EmpName=" + EmpName + ", Month=" + Month + ", totalanuallsalary=" + totalanuallsalary
				+ ", basicsalary=" + basicsalary + ", allowance=" + allowance + ", monthlysalary=" + monthlysalary
				+ ", tax_deducted=" + tax_deducted + ", salarycredited=" + salarycredited + ", ptax=" + ptax
				+ ", extra=" + extra + "]";
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getMonth() {
		return Month;
	}
	public void setMonth(String month) {
		Month = month;
	}
	public Double getTotalanuallsalary() {
		return totalanuallsalary;
	}
	public void setTotalanuallsalary(Double totalanuallsalary) {
		this.totalanuallsalary = totalanuallsalary;
	}
	public Double getBasicsalary() {
		return basicsalary;
	}
	public void setBasicsalary(Double basicsalary) {
		this.basicsalary = basicsalary;
	}
	public Double getAllowance() {
		return allowance;
	}
	public void setAllowance(Double allowance) {
		this.allowance = allowance;
	}
	public Double getMonthlysalary() {
		return monthlysalary;
	}
	public void setMonthlysalary(Double monthlysalary) {
		this.monthlysalary = monthlysalary;
	}
	public Double getTax_deducted() {
		return tax_deducted;
	}
	public void setTax_deducted(Double tax_deducted) {
		this.tax_deducted = tax_deducted;
	}
	public Double getSalarycredited() {
		return salarycredited;
	}
	public void setSalarycredited(Double salarycredited) {
		this.salarycredited = salarycredited;
	}
	public Double getPtax() {
		return ptax;
	}
	public void setPtax(Double ptax) {
		this.ptax = ptax;
	}
	public Double getExtra() {
		return extra;
	}
	public void setExtra(Double extra) {
		this.extra = extra;
	}
	

}
