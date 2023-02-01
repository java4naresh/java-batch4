package exception;

public class ExceptionExample1 {
	public static void main(String[] args) 
	{
	
	
			CollegeData();
			
	

}
public static void CollegeData()
{
	try {
	 int day = 7;

	 if(day == 1){
	    System.out.println("Sunday");

	     }

	 if(day == 2){
	    System.out.println("Monday");

	    }

	 if(day == 3){
	    System.out.println("Tuesday");

	   }

	 if(day == 4){
	    System.out.println("Wednesday");

	   }

	 if(day == 5){
	    System.out.println("Thrusday");

	  }

	 if(day == 6){
	    System.out.println("Friday");
	   }


	 if(day == 7){
	    System.out.println("Saturday");

	   }
   }

catch(Exception e) {
	System.out.println(e.getMessage());
} finally {
	System.out.println("finally");
}
}

}