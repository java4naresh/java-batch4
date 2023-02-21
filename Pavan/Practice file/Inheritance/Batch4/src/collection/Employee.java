package collection;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
	private Integer employeeId;
	private String employeeName;
	private Character gender;
	private Integer age;
	private Integer phoneNumber;
	private String city;
	private int rating;

	public Employee() {
		super();
	}


	public Employee(Integer employeeId, String employeeName, Character gender, Integer age, Integer phoneNumber,
			String city, int rating) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.gender = gender;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.city = city;
		this.rating = rating;
	}


		@Override
	public int hashCode() {
		return Objects.hash(age, city, employeeId, employeeName, gender, phoneNumber, rating);
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
		return Objects.equals(age, other.age) && Objects.equals(city, other.city)
				&& Objects.equals(employeeId, other.employeeId) && Objects.equals(employeeName, other.employeeName)
				&& Objects.equals(gender, other.gender) && Objects.equals(phoneNumber, other.phoneNumber)
				&& rating == other.rating;
	}


		
	public Integer getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public Character getGender() {
		return gender;
	}


	public void setGender(Character gender) {
		this.gender = gender;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public Integer getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", gender=" + gender + ", age="
				+ age + ", phoneNumber=" + phoneNumber + ", city=" + city + ", rating=" + rating + "]";
	}


	@Override
	public int compareTo(Employee o) {
		// return this.city.compareTo(o.getCity());

		// return this.employeeName.compareTo(o.getEmployeeName());

		// return this.gender.compareTo(o.getGender());

		// return this.employeeId.compareTo(o.getEmployeeId());

		 return this.age.compareTo(o.getAge());

		//return this.phoneNumber.compareTo(o.getPhoneNumber());
	}

}