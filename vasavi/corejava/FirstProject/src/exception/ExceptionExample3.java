package exception;

public class ExceptionExample3 {
	public static void main(String[] args) {
		Example();
	}
	
	public static void Example() 
	{
		try {
             
		for(int i=1;i<=1000;i++)
                {
                   int num,rem;
                    num=i;
                    int rev=0;
                    int temp;
                    temp=num;
		 while(num!=0) 
                {
                 
                  rem = num % 10;
                  num = num / 10;
		  rev = (rev * 10) + rem;
		}
		 if(rev == temp) 
				System.out.println(temp +"");
                              
              }
	}
		catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally");
		}
}

}
