package file;

public class EmplyeeDto {
	
	private Long Id;
	private String fristName;
	private String lastName;
	private Character gender;
	private String department;
	private Double salarey;
	private String location;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Character getGender() {
		return gender;
	}
	public void setGender(Character gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Double getSalarey() {
		return salarey;
	}
	public void setSalarey(Double salarey) {
		this.salarey = salarey;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public EmplyeeDto(Long id, String fristName, String lastName, Character gender, String department, Double salarey,
			String location) {
		super();
		Id = id;
		this.fristName = fristName;
		this.lastName = lastName;
		this.gender = gender;
		this.department = department;
		this.salarey = salarey;
		this.location = location;
	}
	@Override
	public String toString() {
		return "EmplyeeDto [Id=" + Id + ", fristName=" + fristName + ", lastName=" + lastName + ", gender=" + gender
				+ ", department=" + department + ", salarey=" + salarey + ", location=" + location + "]";
	}
	

}
