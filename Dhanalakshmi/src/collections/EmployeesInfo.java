package collections;

import java.util.Objects;

public class EmployeesInfo implements Comparable<EmployeesInfo> {
	
	private String employeeName;
	
	private Integer employeeId;
	
	private Integer employeeAge;
	
	private Integer employeephoneNumber;
	
	private Character employeegender;

	
	public EmployeesInfo(String employeeName, Integer employeeId, Integer employeeAge, Integer employeephoneNumber,
			Character employeegender) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeAge = employeeAge;
		this.employeephoneNumber = employeephoneNumber;
		this.employeegender = employeegender;
	}
	@Override
	public int hashCode() {
		return Objects.hash(employeeAge, employeeId, employeeName, employeegender, employeephoneNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeesInfo other = (EmployeesInfo) obj;
		return Objects.equals(employeeAge, other.employeeAge) && Objects.equals(employeeId, other.employeeId)
				&& Objects.equals(employeeName, other.employeeName)
				&& Objects.equals(employeegender, other.employeegender)
				&& Objects.equals(employeephoneNumber, other.employeephoneNumber);
	}
	

	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public Integer getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(Integer employeeAge) {
		this.employeeAge = employeeAge;
	}
	public Integer getEmployeephoneNumber() {
		return employeephoneNumber;
	}
	public void setEmployeephoneNumber(Integer employeephoneNumber) {
		this.employeephoneNumber = employeephoneNumber;
	}
	public Character getEmployeegender() {
		return employeegender;
	}
	public void setEmployeegender(Character employeegender) {
		this.employeegender = employeegender;
	}
	
	

	@Override
	public String toString() {
		return "EmployeesInfo [employeeName=" + employeeName + ", employeeId=" + employeeId + ", employeeAge="
				+ employeeAge + ", employeephoneNumber=" + employeephoneNumber + ", employeegender=" + employeegender
				+ "]";
	}
	public int compareTo(EmployeesInfo o) {
		
		return this.employeephoneNumber.compareTo(o.getEmployeephoneNumber());
	}

}
