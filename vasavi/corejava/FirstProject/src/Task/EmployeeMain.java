package Task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class EmployeeMain {
	
	public static void main(String[] args) throws IOException {
	
		try(FileReader fileReader = new FileReader("E:\\sampleFiles\\sample1.txt")) {
			BufferedReader br = new BufferedReader(fileReader);
			String line = br.readLine();			
			EmployeeInformation[] persons = new EmployeeInformation[10];
			int index = 0;		
			while(line != null) {
				//System.out.println(line);
				String[] s1 = line.split(" ");
				int id = Integer.parseInt(s1[0]);
				String firstName = s1[1];
				String lastName = s1[2];
				char gender = s1[3].charAt(0);
				String dept = s1[4];
				double salary = Double.parseDouble(s1[5]);			
				String city = s1[6];
				
				EmployeeInformation employee = new EmployeeInformation(id, firstName, lastName, gender,salary,dept,city);	
					persons[index] = employee;
					line = br.readLine();
					index  ++;
									
			}
			
			//displayCityBasedData(persons, "Hyderabad");
			
          //displayDeptBasedData(persons, "IT");
			
			//displaySalaryBasedData(persons, 50000);
			
			displayGenderBasedData(persons, 'M');
			
		}
	}
	
	  public static void displayGenderBasedData(EmployeeInformation[] persons, char gender) {
		  for(EmployeeInformation employee: persons) {
			 if(employee.getGender() == (gender)) {
				System.out.println(employee);
			}
			
		}
	
	/*public static void displaySalaryBasedData(EmployeeInformation[] persons, int salary) {
		for(EmployeeInformation employee: persons) {
			if(employee.getSalary()> (salary)) {
				System.out.println(employee);
			}
		}*/
		
		
		/*public static void displayDeptBasedData(EmployeeInformation[] persons, String dept) {
			for(EmployeeInformation employee: persons) {
				if(employee.getDept().equalsIgnoreCase(dept)) {
					System.out.println(employee);
				}
			}*/
		
		
		/*public static void displayCityBasedData(EmployeeInformation[] persons, String city) {
			for(EmployeeInformation employee: persons) {
				if(employee.getCity().equalsIgnoreCase(city)) {
					System.out.println(employee);
				}
			}*/
	}
}
	

			
			
			
			
		
			
			
		
		
		

	
	

