package collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class EmployeeMain {

	public static void main(String[] args) throws IOException{
		
	
		Map<Integer, Map<String, EmpPaySlip>> employee = new HashMap<>();
		FileReader fr = new FileReader("E:\\EmployeeData.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		while ((line = br.readLine()) != null) {
		    String[] fields = line.split(",");
		    int empId = Integer.parseInt(fields[0].trim()); 
	        String empName = fields[1];
	        String month = fields[2];
	        int totalAnnualSalary = Integer.parseInt(fields[3].trim());
	        int basicSalary = Integer.parseInt(fields[4].trim());
	        int allowance = Integer.parseInt(fields[5].trim());
	        int monthlySalary = Integer.parseInt(fields[6].trim());
	        int taxDeducted = Integer.parseInt(fields[7].trim());
	        int salaryCredited = Integer.parseInt(fields[8].trim());
	        int ptax = Integer.parseInt(fields[9].trim());
	        int extra = Integer.parseInt(fields[10].trim());
	
		    EmpPaySlip payslip = new EmpPaySlip(empId, empName, month, totalAnnualSalary, basicSalary, allowance, monthlySalary, taxDeducted, salaryCredited, ptax, extra);
		    if (!employee.containsKey(empId)) {
		      employee.put(empId, new HashMap<String, EmpPaySlip>());
		  }
		  employee.get(empId).put(month, payslip);
		    
		  System.out.println("employee"+ payslip); 
		}
		
		

	}
	
}
