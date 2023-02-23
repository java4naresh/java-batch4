package collection;

import java.util.Objects;

public class EmpDetails {

	private int empId;
	private String empName;
	private String location;
	private double salary;
	private char gender;

	public EmpDetails(int empId, String empName, String location, double salary, char gender) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.location = location;
		this.salary = salary;
		this.gender = gender;
	}

	@Override
	public int hashCode() {
		return empId;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpDetails other = (EmpDetails) obj;
		return empId == other.empId && Objects.equals(empName, other.empName) && gender == other.gender
				&& Objects.equals(location, other.location)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	public EmpDetails() {
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "EmpDetails [empId=" + empId + ", empName=" + empName + ", location=" + location + ", salary=" + salary
				+ ", gender=" + gender + "]";
	}

}
