package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptiontask {

	public void fileNotFound() throws FileNotFoundException {
		File f = new File("");
		
		FileReader fr = new FileReader(f);
	}
	public static void main(String[] args) {
		
		/*int[] numbers = {};
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
    	   //e.printStackTrace();
    	 System.out.println(e.toString());
      } finally {
    	  System.out.println("finally");
      }*/
    	   //NumberFormatException Example
    		/*String strNumber = "234ab";
    		int number = Integer.parseInt(strNumber);
    		System.out.println(number);*/
		
		//NullpointerException Example
		    /* Exceptiontask e = null;
		     e.hashCode();*/
		
		//ArithmeticException Example
		//int div = 10/0;
		
		//ArrayIndexOutOfBoundsExceptionExample
		/*int[] numbers = {1,2,3,4};
		System.out.println(numbers[5]);*/
		
		//ArrayStoreExceptionExample
		/*Number[] numArray = new Double[2];
		numArray[0] = 4;//4d
		System.out.println(numArray[0]);*/
		
		//NegativeArraySizeExceptionExample
		int arr[] = new int[-1];//1
		System.out.println(arr.length);
		

		
		    
		     
    		
     }

}
