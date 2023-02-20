package collection;

import java.util.Objects;

public class Employee {
    private Integer empId;
	
	private String empName;
	
	private Integer empSalary;
	
	private String empDept;
	
	private Character empGender;
	
	

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
		Employee other = (Employee) obj;
		return Objects.equals(empDept, other.empDept) && Objects.equals(empGender, other.empGender)
				&& Objects.equals(empId, other.empId) && Objects.equals(empName, other.empName)
				&& Objects.equals(empSalary, other.empSalary);
	}

	public Employee(Integer empId, String empName, Integer empSalary, String empDept, Character empGender) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDept = empDept;
		this.empGender = empGender;
	}

	public Employee() {
		super();
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Integer empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public Character getEmpGender() {
		return empGender;
	}

	public void setEmpGender(Character empGender) {
		this.empGender = empGender;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empDept=" + empDept
				+ ", empGender=" + empGender + "]";
	}
	
}
