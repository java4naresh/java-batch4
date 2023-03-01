package com.collections;

import java.util.List;

public class EmplyeeMonthelyPayslip {
	
	private String Month;
	
	private EmplyePaySlip empfileds;
	

	public EmplyeeMonthelyPayslip(String month, EmplyePaySlip empfileds) {
		super();
		Month = month;
		this.empfileds = empfileds;
	}
	public EmplyeeMonthelyPayslip() {
		
	}


	public String getMonth() {
		return Month;
	}

	public void setMonth(String month) {
		Month = month;
	}

	public EmplyePaySlip getEmpfileds() {
		return empfileds;
	}

	public void setEmpfileds(EmplyePaySlip empfileds) {
		this.empfileds = empfileds;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Month == null) ? 0 : Month.hashCode());
		result = prime * result + ((empfileds == null) ? 0 : empfileds.hashCode());
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
		EmplyeeMonthelyPayslip other = (EmplyeeMonthelyPayslip) obj;
		if (Month == null) {
			if (other.Month != null)
				return false;
		} else if (!Month.equals(other.Month))
			return false;
		if (empfileds == null) {
			if (other.empfileds != null)
				return false;
		} else if (!empfileds.equals(other.empfileds))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "EmplyeeMonthelyPayslip [Month=" + Month + ", empfileds=" + empfileds + "]";
	}

}
