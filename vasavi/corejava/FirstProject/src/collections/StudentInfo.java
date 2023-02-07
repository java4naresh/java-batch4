package collections;

import java.util.Objects;

public class StudentInfo  implements Comparable<StudentInfo>{
	
	private Integer id;
	private String name;
	private Integer age;
	private Integer phoneNumber;
	private String city;
	private Character gender;
	
	
	public StudentInfo(Integer id, String name, Integer age, Integer phoneNumber, String city, Character gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.city = city;
		this.gender = gender;
	}



	public StudentInfo() {
		super();
		
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(age, city, id, name, phoneNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentInfo other = (StudentInfo) obj;
		return age == other.age && Objects.equals(city, other.city) && id == other.id
				&& Objects.equals(name, other.name) && phoneNumber == other.phoneNumber;
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

	public Character getGender() {
		return gender;
	}



	public void setGender(Character gender) {
		this.gender = gender;
	}



	@Override
	public String toString() {
		return "StudentInfo [id=" + id + ", name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + ", city="
				+ city + ", gender=" + gender + "]";
	}



	@Override
	public int compareTo(StudentInfo o) {
		
		//return this.city.compareTo(o.getCity());
		
		//return this.name.compareTo(o.getName());
		
	    // return this.gender.compareTo(o.getGender());
	     
		//return this.id.compareTo(o.getId());
		
		return this.age.compareTo(o.getAge());
		
		//return this.phoneNumber.compareTo(o.getPhoneNumber());
	}
	
	
	
	
	
}
