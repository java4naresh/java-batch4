class WhileLoopExample 
{
	public static void main(String[] args) 
	{
             int num,rem;
             int rev=0;
             int temp;
		for(int i=1;i<=1000;i++)
                {
                  num=i;
		 while(num>0) 
                {
                  temp= num;
                  rem = num % 10;
                  num = num / 10;
		  rev = (rev * 10) + rem;
		}
		if(rev == num) 
		System.out.println(num +"");
                              
              }
	}
}