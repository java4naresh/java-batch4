package tasks;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class EmployeeMain {
	

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		try(FileReader fileReader = new FileReader("E:\\sampleFiles\\sample3.txt")) {
			BufferedReader br = new BufferedReader(fileReader);
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
				String[] s3 = line.split(" ");
				for(int i =0 ; i<s3.length; i++) {
					String s2= s3[i];
					s2 = s2.toLowerCase();
					if(s2.charAt(0) >= 'a'&s2.charAt(0)<='z') {
						System.out.println(s2);
					}else {
						int a = Integer.parseInt(s2);
						System.out.println(a);
					}
					
				}				
			
			}			
		}
	}
}