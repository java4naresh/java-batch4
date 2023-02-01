package tasks;

public class PersonInfo {
	private int id ;
	private String name;
	private int age;
	private String phoneNumber;
	
	public PersonInfo(int id, String name, int age, String phoneNumber) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.phoneNumber = phoneNumber;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "PersonInfo [id=" + id + ", name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + "]";
	}
	
	

}
