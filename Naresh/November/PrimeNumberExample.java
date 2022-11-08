class  PrimeNumberExample
{
	public static void main(String[] args) 
	{
		int num = 3;
        //boolean flag = false;
		int flag = 1;
		for(int i = 2; i < num; i++) {
		if(num % i == 0) {
           flag = 0;
		   break;
		}
		}
        System.out.println((flag != 1)? "not prime" : "prime");

		
	}
}
