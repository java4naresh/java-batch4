package collection;

public class JavaStudent {
	
	private int id;
	
	private String name;
	
	private char gender;
	
	private String qualification;
	
	private String skill;
	
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + gender;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((qualification == null) ? 0 : qualification.hashCode());
		result = prime * result + ((skill == null) ? 0 : skill.hashCode());
		return result;
	}*/
	public int hashCode() {
		return id;
	}
	
	
	/*@Override
	public boolean equals(Object obj) {
		JavaStudent student = (JavaStudent)obj;
		if(this.name == null && student.getName() != null) return false;
		if(!this.name.equals(student.getName())) return false;
		else if(this.gender != student.getGender()) return false;
		else if(!this.qualification.equals(student.getQualification())) return false;
		else if(!this.skill.equals(student.getSkill())) return false;
		return true;
	}*/
	
	

	public JavaStudent(int id, String name, char gender, String qualification, String skill) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.qualification = qualification;
		this.skill = skill;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JavaStudent other = (JavaStudent) obj;
		if (gender != other.gender)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (qualification == null) {
			if (other.qualification != null)
				return false;
		} else if (!qualification.equals(other.qualification))
			return false;
		if (skill == null) {
			if (other.skill != null)
				return false;
		} else if (!skill.equals(other.skill))
			return false;
		return true;
	}

	public JavaStudent() {
		super();
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "JavaStudent [id=" + id + ", name=" + name + ", gender=" + gender + ", qualification=" + qualification
				+ ", skill=" + skill + "]";
	}

	
	
	

}
