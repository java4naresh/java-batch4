package tasks;

public class ExceptionHandilingExample {
	public static void main(String[] args) {
		  try {
		for(int i=1; i<=1000; i++) {
		      int num = 2;
		    
		      int temp = num;
		      int rev = 0;
		      while(num !=0){
		      int rem = num % 10;
		      num = num / 10;
		      rev = (rev * 10) + rem;
		      }
		   
		      
		      if(temp == rev) {
		      System.out.println("Polindrome" +temp);
		      } else {
		      System.out.println("Not Polindrome" +temp);
		      }    
	  }
	  } catch(Exception e) {
		   	 System.out.println(e.getMessage());
	     } finally {
	   	  System.out.println("finally");
	     }
	}


}
