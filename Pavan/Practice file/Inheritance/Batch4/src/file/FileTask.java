package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileTask {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\PARDHU\\OneDrive\\Desktop\\Batch4\\Sample.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		EmployeeDTO[] employees = new EmployeeDTO[10];
		int index = 0;
		while(line != null) {
			//System.out.println(line);
			String[] values = line.split(" ");
			Long id = Long.parseLong(values[0]);
			String firstName = values[1];
			String lastName = values[2];
			char gender = values[3].charAt(0);
			String dept = values[4];
			Double salary = Double.parseDouble(values[5]);
			String city = values[6];
			EmployeeDTO dto = new EmployeeDTO(id, firstName, lastName, gender, dept, salary, city);
			employees[index] = dto;
			//System.out.println(dto);
			line = br.readLine();
			index ++;
		}
       //displayCityBasedData(employees, "Sattenapalli");
      // displaySalaryBasedData(employees, 35000d);
		//displayGenderBasedData(employees, 'F');
		//displayDepartmentBasedData (employees, "Manager");
		//displayLastNameBasedData(employees, "Kayali");
		displayNameBasedData(employees, "Pavan");
	}
	
	public static void displayCityBasedData(EmployeeDTO[] employees, String city) {
		for(EmployeeDTO employee: employees) {
			if(employee.getCity().equalsIgnoreCase(city)) {
				System.out.println(employee);
			}
		}
	}
	
	public static void displaySalaryBasedData(EmployeeDTO[] employees, Double Salary) {
		for(EmployeeDTO employee: employees) {
			if(employee.getSalary()>Salary) {
				System.out.println(employee);
			}
		}
	}
	
	public static void displayGenderBasedData(EmployeeDTO[] employees, Character gender) {
		for(EmployeeDTO employee: employees) {
			if(employee.getGender().equals(gender)) {
				System.out.println(employee);
			}
		}
	}
	
	public static void displayDepartmentBasedData(EmployeeDTO[] employees, String department) {
		for(EmployeeDTO employee: employees) {
			if(employee.getDepartment().equalsIgnoreCase(department)) {
				System.out.println(employee);
			}
		}
	}
	
	public static void displayLastNameBasedData(EmployeeDTO[] employees, String lastName) {
		for(EmployeeDTO employee: employees) {
			if(employee.getLastName().equalsIgnoreCase(lastName)) {
				System.out.println(employee);
			}
		}
	}
	
	public static void displayNameBasedData(EmployeeDTO[] employees, String firstName) {
		for(EmployeeDTO employee: employees) {
			if(employee.getFirstName().equalsIgnoreCase(firstName)) {
				System.out.println(employee);
			}
		}
	}
	
	

}
