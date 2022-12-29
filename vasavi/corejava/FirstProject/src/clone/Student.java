package clone;

public class Student {

	private String SchoolName;

	public Student(String SchoolName ) {
		super();
		this.SchoolName = SchoolName;
	}

	public String getSchoolName() {
		return SchoolName;
	}

	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}

	@Override
	public String toString() {
		return "Student [SchoolName=" + SchoolName + "]";
	}
	
	
	
	

}
