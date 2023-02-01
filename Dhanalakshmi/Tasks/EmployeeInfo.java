package tasks;


		public class EmployeeInfo {

			private int id;
			
			private String firstName;
			
			private String lastName;
			
			private char gender;
			
			private String dept;
			
			private double salary;
			
			private String city;
			
			
			public EmployeeInfo(int id, String firstName, String lastName, char gender, String dept, double salary,
					String city) {
				super();
				this.id = id;
				this.firstName = firstName;
				this.lastName = lastName;
				this.gender = gender;
				this.dept = dept;
				this.salary = salary;
				this.city = city;
			}


			public int getId() {
				return id;
			}


			public void setId(int id) {
				this.id = id;
			}


			public String getFirstName() {
				return firstName;
			}


			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}


			public String getLastName() {
				return lastName;
			}


			public void setLastName(String lastName) {
				this.lastName = lastName;
			}


			public char getGender() {
				return gender;
			}


			public void setGender(char gender) {
				this.gender = gender;
			}


			public String getDept() {
				return dept;
			}


			public void setDept(String dept) {
				this.dept = dept;
			}


			public double getSalary() {
				return salary;
			}


			public void setSalary(double salary) {
				this.salary = salary;
			}


			public String getCity() {
				return city;
			}


			public void setCity(String city) {
				this.city = city;
			}


			@Override
			public String toString() {
				return "EmployeeInfo [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender="
						+ gender + ", dept=" + dept + ", salary=" + salary + ", city=" + city + "]";
			}
			
					
}


