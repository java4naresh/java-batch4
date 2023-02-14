package collection;

import java.util.Objects;

public class EmployeeTask {
	private int employeeId;
	private String employeeName;
	private long employeeSalary;
	private String employeeDepartment;
	private char employeeGender;

	public EmployeeTask() {
		super();
	}

	public EmployeeTask(int employeeId, String employeeName, long employeeSalary, String employeeDepartment,
			char employeeGender) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeDepartment = employeeDepartment;
		this.employeeGender = employeeGender;
	}

	@Override
	public int hashCode() {
		return employeeId;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeTask other = (EmployeeTask) obj;
		return Objects.equals(employeeDepartment, other.employeeDepartment) && employeeGender == other.employeeGender
				&& employeeId == other.employeeId && Objects.equals(employeeName, other.employeeName)
				&& employeeSalary == other.employeeSalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public long getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(long employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	public char getEmployeeGender() {
		return employeeGender;
	}

	public void setEmployeeGender(char employeeGender) {
		this.employeeGender = employeeGender;
	}

	@Override
	public String toString() {
		return "EmployeeTask [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", employeeDepartment=" + employeeDepartment + ", employeeGender=" + employeeGender
				+ "]";
	}

}
