package Task;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class EmployeeMain {
	

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		try(FileReader fileReader = new FileReader("E:\\sampleFiles\\sample1.txt")) {
			BufferedReader br = new BufferedReader(fileReader);
			String line = br.readLine();
			
			EmployeeInformation[] persons = new EmployeeInformation[6];
			int index = 0;
			
			while(line != null) {
				System.out.println(line);
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
					index++;
									
				line = br.readLine();
			}	
								
	   }
	
	
     }
	
   /*public void displayCitybasedData(EmployeeInformation[] persons, String city) {
		
		if(persons.equals("Hyderabad")) {
			System.out.println(persons);
		}
	}*/
	
	
	/*public void DisplayGenderBasedData (EmployeeInformation[] employee, char gender) {
		
		if(employee.equals('M')) {
			
			System.out.println(employee);
		}
		}*/
	
	public  void  DisplaysalaryBasedData(EmployeeInformation[] employee, double salary) {
		
		if(employee.length < 50000) {
			System.out.println(employee);
		}
		
	}
	
	
	

	
}

	

			
			
			
			
		
			
			
		
		
		

	
	

