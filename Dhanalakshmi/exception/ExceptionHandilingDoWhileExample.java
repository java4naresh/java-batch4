package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandilingDoWhileExample {

	public void fileNotFound() {
		File f = new File("");
		try {
		FileReader fr = new FileReader(f);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	 }
   }
	public static void main(String[] args) {
				 int i = ;
				 try {

	     do
	     {
	       System.out.println(i++);
	     
	     }
	     while (i <=0);

	     while(i <= 0) {
	     System.out.println(i++);
	     }

	} catch(Exception e) {
   	 System.out.println(e.getMessage());
     } finally {
   	  System.out.println("finally");
     }
	}
}
