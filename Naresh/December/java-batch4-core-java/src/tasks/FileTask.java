package tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
       displayCityBasedData(employees, "Hyderabad");
	}
	
	public static void displayCityBasedData(EmployeeDTO[] employees, String city) {
		for(EmployeeDTO employee: employees) {
			if(employee.getCity().equalsIgnoreCase(city)) {
				System.out.println(employee);
			}
		}
	}

}
