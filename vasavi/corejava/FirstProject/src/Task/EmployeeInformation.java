package Task;

public class EmployeeInformation {

	private int id;
	private String FirstName;
	private String LastName;
	private String gender;
	private int salary;
	private String Dept;
	private String City;
	private int Experience;
	
	public EmployeeInformation(int id,String FirstName,String LastName,String gender,int salary,String Dept,String City,int Experience) {
		
		this.id = id;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.gender = gender;
		this.salary = salary;
		this.Dept = Dept;
		this.City = City;
		this.Experience = Experience;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public  int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public int getExperience() {
		return Experience;
	}

	public void setExperience(int experience) {
		Experience = experience;
	}

	@Override
	public String toString() {
		return "EmployeeInformation [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", gender="
				+ gender + ", salary=" + salary + ", Dept=" + Dept + ", City=" + City + ", Experience=" + Experience
				+ "]";
	}
	
	
	
	
}
