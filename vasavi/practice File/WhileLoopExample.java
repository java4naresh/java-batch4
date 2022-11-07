class WhileLoopExample 
{
	public static void main(String[] args) 
	{
             
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
}