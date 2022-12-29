package clone;

public class SwallowCloningExample implements Cloneable {
	
	private String name;
	
	private int HallticketNumber;
	
	private Student stu;
	
	public  SwallowCloningExample(String name,int HallticketNumber,Student stu) {
		
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

	public SwallowCloningExample clone() throws CloneNotSupportedException {
		return  (SwallowCloningExample)super.clone();
	}

	@Override
	public String toString() {
		return "SwallowCloningExample [name=" + name + ", HallticketNumber=" + HallticketNumber + ", stu=" + stu + "]";
	}

	
	

}
