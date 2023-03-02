package collection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class VeerababuTest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
				Map<String, Map<String, EmplyePaySlip>> employee = new HashMap<>();
				FileReader fr = new FileReader("D:\\JavaBatch4\\February\\java-batch4\\Naresh\\December\\java-batch4-core-java\\src\\collection\\EmplyePaySlip.txt");
				BufferedReader br = new BufferedReader(fr);
				String PaySlips;

				while ((PaySlips = br.readLine()) != null) {
					String arry[] = PaySlips.split(",");
					String  emplyeId=arry[0];
					String EmpName=arry[1];
					String month=arry[2];
					Double totalanuallsalary=Double.parseDouble(arry[3]);
					Double basicsalary=Double.parseDouble(arry[4]);
				    Double allowance=Double.parseDouble(arry[5]);
					Double monthlysalary=Double.parseDouble(arry[6]);
					Double tax_deducted=Double.parseDouble(arry[7]);
					Double salarycredited=Double.parseDouble(arry[8]);
					Double ptax=Double.parseDouble(arry[9]);
					Double extra=Double.parseDouble(arry[10]);
				
					EmplyePaySlip emplyePaySlip=new EmplyePaySlip(EmpName,month,totalanuallsalary,basicsalary,allowance,monthlysalary,tax_deducted,salarycredited,ptax,extra);
					
					if (!employee.containsKey(emplyeId)) {
					      employee.put(emplyeId, new HashMap<String, EmplyePaySlip>());
					  }
					  employee.get(emplyeId).put(month, emplyePaySlip);
					
					  System.out.println(employee);
				}


	}

}
