package file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filereader {

	

	public filereader(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception  {
		
		
		 
		
			 FileReader 	fr = new FileReader("C:\\Users\\veeru\\Documents\\workspace-spring-tool-suite-4-4.10.0.RELEASE\\javabatch4\\sample.txt.txt");
			 BufferedReader   br = new BufferedReader(fr);
			 //System.out.println(br);
			 
			 EmplyeeDto[] emplyedto=new EmplyeeDto[10];
			 
			  String line=br.readLine();
			  int index=0;
			 while(line !=null)
			 {
				String[] objectfileds = line.split(" ");
				
				Long Id=Long.parseLong(objectfileds[0]);
				String fristName=objectfileds[1];
				String lastName=objectfileds[2];
				Character gender=objectfileds[3].charAt(0);
				String department=objectfileds[4];
				Double salarey=Double.parseDouble(objectfileds[5]);
				String location=objectfileds[6];
				EmplyeeDto dto=new EmplyeeDto(Id,fristName,lastName,gender,department,salarey,location);
				emplyedto[index]=dto;
				//System.out.println(dto);
				line=br.readLine();
				
				index ++;
				//
				
				
			 }
			
			
			 //emplyeecitybasedData( emplyedto, "Vijayawada");
			 
			// emplyeeGenderBaseData( emplyedto, 'F');
			 emplyeeDepartmentbasedData( emplyedto, "IT");
			 //emplayeesalareybaseData( emplyedto, 60000d);
			
			
		
		

	}
	
	public static void emplyeecitybasedData(EmplyeeDto[] emplyedto, String city)
	{
		for(EmplyeeDto empDTO:emplyedto)
		{
			if(empDTO.getLocation().equalsIgnoreCase(city))
			{
				System.out.println(empDTO);
			}
		}
	}
	public static void emplyeeDepartmentbasedData(EmplyeeDto[] emplyedto, String Department)
	{
		for(EmplyeeDto empDTO:emplyedto)
		{
			if(empDTO.getLocation().equalsIgnoreCase(Department))
			{
				System.out.println(empDTO);
			}
		}
	}
	public static void emplyeeGenderBaseData(EmplyeeDto[] emplyedto, Character gender)
	{
		for(EmplyeeDto empDTO:emplyedto)
		{
			if(empDTO.getGender().equals(gender))
			{
				System.out.println(empDTO);
			}
		}
	}
	public static void emplayeesalareybaseData(EmplyeeDto[] emplyedto, Double salary)
	{
		for(EmplyeeDto empDTO:emplyedto)
		{
			if(empDTO.getSalarey()<salary)
			{
				System.out.println(empDTO);
			}
		}
	}

}
