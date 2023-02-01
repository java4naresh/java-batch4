package clone;

public class DeepCloning implements Cloneable{

	private String name;
	
	private Integer age;
	
	private Employee emp;

	public DeepCloning(String name, Integer age,Employee emp) {
		super();
		this.name = name;
		this.age = age;
		this.emp = emp;
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

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public DeepCloning clone() throws CloneNotSupportedException {
		Employee emp = new Employee(this.emp.getCompanyName());
		DeepCloning dc = new DeepCloning(this.name,this.age,emp);
		return dc;
	}

	@Override
	public String toString() {
		return "DeepCloning [name=" + name + ", age=" + age + ", emp=" + emp + "]";
	}

			
	


}
