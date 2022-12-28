package clone;

public class SwallowCloning implements Cloneable {

		
		private String name;
		
		private Integer age;
		
		private Employee emp;

		public SwallowCloning(String name, Integer age,Employee emp) {
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

		public SwallowCloning clone() throws CloneNotSupportedException {
			return (SwallowCloning)super.clone();
		}

		@Override
		public String toString() {
			return "SwallowCloning [name=" + name + ", age=" + age + ", emp=" + emp + "]";
		}

				
		
	

}
