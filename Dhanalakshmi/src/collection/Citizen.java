package collection;

import java.util.Objects;

public class Citizen implements Comparable<Citizen> {
	
	private int citizenId;
	
	private String citizenName;
	
	private int age;
	
	private String nationality;

	public Citizen(int citizenId, String citizenName, int age, String nationality) {
		super();
		this.citizenId = citizenId;
		this.citizenName = citizenName;
		this.age = age;
		this.nationality = nationality;
	}

	public Citizen() {
		super();
	}
	
	@Override
	public int hashCode() {
		return citizenId;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Citizen other = (Citizen) obj;
		return age == other.age && citizenId == other.citizenId && Objects.equals(citizenName, other.citizenName)
				&& Objects.equals(nationality, other.nationality);
			
	}

	public int getCitizenId() {
		return citizenId;
	}

	public void setCitizenId(int citizenId) {
		this.citizenId = citizenId;
	}

	public String getCitizenName() {
		return citizenName;
	}

	public void setCitizenName(String citizenName) {
		this.citizenName = citizenName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		return "Citizen [citizenId=" + citizenId + ", citizenName=" + citizenName + ", age=" + age + ", nationality="
				+ nationality + "]";
	}

	@Override
	public int compareTo(Citizen o) {
		
		return this.age - o.getAge();
		/*if(this.age < o.getAge()) return -1;
		else if(this.age > o.getAge()) return 1;
		else return 0;*/
	}
	
}
