package com.collections;

public class emplyeeMonthlySalary {
	private String id;
	private EmplyeeMonthelyPayslip emplyeeMonthelyPayslip;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public EmplyeeMonthelyPayslip getEmplyeeMonthelyPayslip() {
		return emplyeeMonthelyPayslip;
	}
	public void setEmplyeeMonthelyPayslip(EmplyeeMonthelyPayslip emplyeeMonthelyPayslip) {
		this.emplyeeMonthelyPayslip = emplyeeMonthelyPayslip;
	}
	public emplyeeMonthlySalary(String id, EmplyeeMonthelyPayslip emplyeeMonthelyPayslip) {
		super();
		this.id = id;
		this.emplyeeMonthelyPayslip = emplyeeMonthelyPayslip;
	}
	public emplyeeMonthlySalary() {
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emplyeeMonthelyPayslip == null) ? 0 : emplyeeMonthelyPayslip.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		emplyeeMonthlySalary other = (emplyeeMonthlySalary) obj;
		if (emplyeeMonthelyPayslip == null) {
			if (other.emplyeeMonthelyPayslip != null)
				return false;
		} else if (!emplyeeMonthelyPayslip.equals(other.emplyeeMonthelyPayslip))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "emplyeeMonthlySalary [id=" + id + ", emplyeeMonthelyPayslip=" + emplyeeMonthelyPayslip + "]";
	}

}
