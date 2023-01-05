package tasks;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTask {

	public static void main(String[] args) throws IOException {
	   FileReader fr = new FileReader("C:/sampleFiles\\sample3.txt");
	   BufferedReader br = new BufferedReader(fr);
	   String line = br.readLine();
	   EmployeeInfo[] employees = new EmployeeInfo[10];
	   int index = 0;
	   while(line != null) {
		   //System.out.println(line);
		   String[] values = line.split(" ");
		   int id = Integer.parseInt(values[0]);
		   String firstName = values[1];
		   String lastName = values[2];
		   char gender = values[3].charAt(0);
		   String dept = values[4];
		   Double salary = Double.parseDouble(values[5]);
		   String city = values[6];
		   EmployeeInfo ei = new EmployeeInfo(id,firstName,lastName,gender,dept,salary,city);
		   employees[index] = ei;
		   //System.out.println(ei);
		   line = br.readLine();
		   index ++;
	   }
      //displayCityBasedData(employees,"Hyderabad");
	   
      //displayDeptBasedData(employees,"IT");
	   
	   //displaySalaryBasedData(employees,50000);
	   
	   displayGenderBasedData(employees,'M');
	}
	
	/*public static void displayCityBasedData(EmployeeInfo[] employees,String city) {
		for(EmployeeInfo employee: employees ) {
			if(employee.getCity().equalsIgnoreCase(city)) {
				System.out.println(employee);
			}
		}
	}*/

	/*public static void displayDeptBasedData(EmployeeInfo[] employees, String dept) {
		for(EmployeeInfo employee: employees) {
			if(employee.getDept().equalsIgnoreCase(dept)) {
				System.out.println(employee);
			}
		}
		
	}*/
	
	/*public static void displaySalaryBasedData(EmployeeInfo[] employees, double salary) {
		for(EmployeeInfo employee: employees) {
			if(employee.getSalary()< (salary)) {
				System.out.println(employee);
			}
		}
   }*/
	
	public static void displayGenderBasedData(EmployeeInfo[] employees, char gender) {
		for(EmployeeInfo employee: employees) {
			if(employee.getGender() == (gender)) {
				System.out.println(employee);
			}
		}
   }
}
