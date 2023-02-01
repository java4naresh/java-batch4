package tasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionExample {
	public void fileNotFound() {
		File f = new File("");
		try {
		FileReader fr = new FileReader(f);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	 }
   }
	public static void main(String[] args) {
	    
		int num = 24;
		try {
			System.out.println(num);
		 if(num % 2 ==0){
		 System.out.println("Even");
		} else {
		 System.out.println("Odd");
		}
	  } catch(Exception e) {
	    	 System.out.println(e.getMessage());
	      } finally {
	    	  System.out.println("finally");
	      }
	} 

}
