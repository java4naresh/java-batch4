package clone;

public class DeepCloneExample implements Cloneable {
	
private String name;
	
	private int HallticketNumber;
	
	private Student stu;
	
	public  DeepCloneExample(String name,int HallticketNumber,Student stu) {
		
		super();
		this.name = name;
		this.HallticketNumber =  HallticketNumber;
		this.stu = stu;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHallticketNumber() {
		return HallticketNumber;
	}

	public void setHallticketNumber(int hallticketNumber) {
		HallticketNumber = hallticketNumber;
	}
	
	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}

	public DeepCloneExample clone() throws CloneNotSupportedException {
		Student stu = new Student(this.stu.getSchoolName());
		DeepCloneExample dc = new DeepCloneExample(this.name, this.HallticketNumber, stu);
		return dc;
		
		
	}

	@Override
	public String toString() {
		return "DeepCloneExample [name=" + name + ", HallticketNumber=" + HallticketNumber + ", stu=" + stu + "]";
	}

	

}
