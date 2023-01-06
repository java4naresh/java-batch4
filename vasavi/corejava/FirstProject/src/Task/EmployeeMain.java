package Task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



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
		
					takeUserInput(persons);
			}
	}
			
			public static void takeUserInput(EmployeeInformation[] employees) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Hello vasavi choose your option below");
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
					displayDeptBasedData(employees, dept);
			        System.out.println("Do you want to continue:");
			        String res = sc.next();
			       while("yes".equalsIgnoreCase(res)) {
			    	   System.out.println("Enter department:");
			    	   dept = sc.next();
					   displayDeptBasedData(employees, dept);
			   		   System.out.println("Do you want to continue:");
			           res = sc.next();
			       }
				} else if(option == 4) {
					System.out.println("Enter salary:");
					Double salary = sc.nextDouble();
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


	
	  public static void displayGenderBasedData(EmployeeInformation[] persons, char gender) {
		  for(EmployeeInformation employee: persons) {
			 if(employee.getGender() == (gender)) {
				System.out.println(employee);
			}
		  }
			
		}
	
	public static void displaySalaryBasedData(EmployeeInformation[] persons,double salary) {
		for(EmployeeInformation employee: persons) {
			if(employee.getSalary()> (salary)) {
				System.out.println(employee);
			}
		}
	}
		
		
		public static void displayDeptBasedData(EmployeeInformation[] persons, String dept) {
			for(EmployeeInformation employee: persons) {
				if(employee.getDept().equalsIgnoreCase(dept)) {
					System.out.println(employee);
				}
			}
		}
		
		
		public static void displayCityBasedData(EmployeeInformation[] persons, String city) {
			for(EmployeeInformation employee: persons) {
				if(employee.getCity().equalsIgnoreCase(city)) {
					System.out.println(employee);
				}
			}
		}
}

	

			
			
			
			
		
			
			
		
		
		

	
	

