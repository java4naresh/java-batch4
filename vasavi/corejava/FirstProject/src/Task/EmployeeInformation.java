package Task;

public class EmployeeInformation {

	private double id;
	private String FirstName;
	private String LastName;
	private char gender;
	private double salary;
	private String dept;
	private String city;
	
	
	public EmployeeInformation(double id,String FirstName,String LastName,char gender,double salary,String dept,String city) {
		
		this.id = id;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.gender = gender;
		this.salary = salary;
		this.dept = dept;
		this.city = city;
		
	}

	public double  getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public  double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		dept = dept;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		city = city;
	}



	@Override
	public String toString() {
		return "EmployeeInformation [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", gender="
				+ gender + ", salary=" + salary + ", Dept=" + dept + ", City=" + city+"]";
	}
	
	
	
	
}
