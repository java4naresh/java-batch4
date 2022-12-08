package oops;

public class Person {

	public String personName;
	
	public char gender;
	
	public Address address;

	public Person(String personName, char gender, Address address) {
		super();
		this.personName = personName;
		this.gender = gender;
		this.address = address;
	}
	
	public Address getAddress() {
		return this.address;
	}
}
