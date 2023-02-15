package collection;

public class Person implements Comparable<Person> {

	private int personId;

	private String personName;

	private String email;

	private Double income;

	private String city;

	public Person(int personId, String personName, String email, Double income, String city) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.email = email;
		this.income = income;
		this.city = city;
	}

	public Person() {
		super();
	}

	@Override
	public int hashCode() {
		return personId;
	}

	@Override
	public boolean equals(Object obj) {
		Person person = (Person) obj;
		if (this.personName.equals(person.getPersonName()) && this.city.equals(person.getCity())
				&& this.email.equals(person.getEmail()) && this.income.equals(person.getIncome()))
			return true;
		return false;

	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", email=" + email + ", income=" + income
				+ ", city=" + city + "]";
	}

	@Override
	public int compareTo(Person o) {
		// return this.income.compareTo(o.getIncome());
		// return o.getIncome().compareTo(this.income);
		// if(this.income > o.getIncome()) return 1;
		// else if(this.income < o.getIncome()) return -1;
		// else return 0;
		// return 0;
		// if(this.income > o.getIncome()) return 1;
		// else if(this.income < o.getIncome()) return -1;
		// else return 0;
		// return 0;

		// return this.personName.compareTo(getPersonName());

		/*
		 * if(this.personName.length() > o.getPersonName().length()) return 1; else if
		 * (this.personName.length() < o.getPersonName().length()) return -1; else
		 * return 0;
		 */

		return this.city.compareTo(getCity());

		/*
		 * if(this.city.length() < o.getCity().length()) return 1; else if
		 * (this.city.length() > o.getCity().length()) return -1; else return 0;
		 */

	}

}
