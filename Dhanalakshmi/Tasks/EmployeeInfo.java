package tasks;


		public class EmployeeInfo {

			private int id;
			private String FirstName;
			private String LastName;
			private char gender;
			private double salary;
			private String Dept;
			private String City;
			
			
			public EmployeeInfo(int id,String FirstName,String LastName,char gender,double salary,String Dept,String City) {
				
				this.id = id;
				this.FirstName = FirstName;
				this.LastName = LastName;
				this.gender = gender;
				this.salary = salary;
				this.Dept = Dept;
				this.City = City;
				
			}

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public String getFirstName() {
				return FirstName;
			}

			public void setFirstName(String firstName) {
				FirstName = firstName;
			}

			public String getLastName() {
				return LastName;
			}

			public void setLastName(String lastName) {
				LastName = lastName;
			}

			public char getGender() {
				return gender;
			}

			public void setGender(char gender) {
				this.gender = gender;
			}

			public  double getSalary() {
				return salary;
			}

			public void setSalary(double salary) {
				this.salary = salary;
			}

			public String getDept() {
				return Dept;
			}

			public void setDept(String dept) {
				Dept = dept;
			}

			public String getCity() {
				return City;
			}

			public void setCity(String city) {
				City = city;
			}



			@Override
			public String toString() {
				return "EmployeeInformation [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", gender="
						+ gender + ", salary=" + salary + ", Dept=" + Dept + ", City=" + City+"]";
			}
			
			
			
			
}
