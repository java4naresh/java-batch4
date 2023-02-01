package tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileTask {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("E:\\sampleFiles\\sample3.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		EmployeeDTO[] employees = new EmployeeDTO[11];
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
		takeUserInput(employees);
	}
	
	public static void takeUserInput(EmployeeDTO[] employees) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello Mr.Naresh choose your option below");
		System.out.println("For city press 1");
		System.out.println("For gender press 2");
		System.out.println("For dept press 3");
		System.out.println("For salary press 4");
		int option = sc.nextInt();
		
		if(option == 1) {
			System.out.println("Enter city name:");
			String city = sc.next();
	        displayCityBasedData(employees, city);
	        System.out.println("Do you want to continue:");
	        String res = sc.next();
	       while("yes".equalsIgnoreCase(res)) {
	    	   System.out.println("Enter city name:");
	   		   city = sc.next();
	   		   displayCityBasedData(employees, city);
	   		   System.out.println("Do you want to continue:");
	           res = sc.next();
	       }
		} else if(option == 2) {
			System.out.println("Enter gender:");
			char gender = sc.next().charAt(0);
			displayGenderBasedData(employees, gender);
	        System.out.println("Do you want to continue:");
	        String res = sc.next();
	       while("yes".equalsIgnoreCase(res)) {
	    	   System.out.println("Enter gender:");
	    	   gender = sc.next().charAt(0);
	    	   displayGenderBasedData(employees, gender);
	   		   System.out.println("Do you want to continue:");
	           res = sc.next();
	       }
		} else if(option == 3) {
			System.out.println("Enter department:");
			String dept = sc.next();
			displayDepartmentBasedData(employees, dept);
	        System.out.println("Do you want to continue:");
	        String res = sc.next();
	       while("yes".equalsIgnoreCase(res)) {
	    	   System.out.println("Enter department:");
	    	   dept = sc.next();
			   displayDepartmentBasedData(employees, dept);
	   		   System.out.println("Do you want to continue:");
	           res = sc.next();
	       }
		} else if(option == 4) {
			System.out.println("Enter salary:");
			double salary = sc.nextDouble();
			displaySalaryBasedData(employees, salary);
	        System.out.println("Do you want to continue:");
	        String res = sc.next();
	       while("yes".equalsIgnoreCase(res)) {
	    	   System.out.println("Enter salary:");
	    	   salary = sc.nextDouble();
			   displaySalaryBasedData(employees, salary);
	   		   System.out.println("Do you want to continue:");
	           res = sc.next();
	       }
		}
		
	}
	
	/**
	 * this method will display the city based data
	 * @param employees
	 * @param city
	 */
	public static void displayCityBasedData(EmployeeDTO[] employees, String city) {
		for(EmployeeDTO employee: employees) {
			// checking with city
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
