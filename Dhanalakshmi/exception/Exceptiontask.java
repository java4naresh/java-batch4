package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptiontask {

	public void fileNotFound() {
		File f = new File("");
		try {
		FileReader fr = new FileReader(f);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	 }
	}
	public static void main(String[] args) {
		
		int[] numbers = {};
		try {
			
		
	      System.out.println(numbers[0]);//20
	      System.out.println(numbers[1]);//30
	      System.out.println(numbers[2]);//40
	      System.out.println(numbers[3]);//50 
	      System.out.println(numbers[4]);//60 
	      System.out.println(numbers[5]);//80
	      System.out.println(numbers[6]);//90
	 
	      numbers[2]=100;
	      System.out.println(numbers[0]);//20
	      System.out.println(numbers[1]);//30
	      System.out.println(numbers[2]);//100
	      System.out.println(numbers[3]);//50 
	      System.out.println(numbers[4]);//60 
	      System.out.println(numbers[5]);//80
	      System.out.println(numbers[6]);//90
		
	  
       } catch(Exception e) {
    	 System.out.println(e.getMessage());
      } finally {
    	  System.out.println("finally");
      }
    	 
    		
     }

}
