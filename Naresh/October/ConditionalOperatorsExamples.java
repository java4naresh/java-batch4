class ConditionalOperatorsExamples 
{
	public static void main(String[] args) 
	{
		int day = 5;
		int num1 = 10;
		int num2 = 20;
        
		if(day == 1) {
		   System.out.println("Sunday");
		   num1++;
		} 
		if(day == 2) {
		System.out.println("Monday");
		num2++;
		}

		if(day == 3) {
		System.out.println("Tuesday");
		num1++;
		num2++;
		}

		if(day == 4) {
		System.out.println("Wednesday");
		num1++;
		num2++;
		}

		if(day == 5) {
		System.out.println("Thursday");
		
		num2++;
		}

		if(day == 6) {
		System.out.println("Friday");
		num1++;
		
		}

		if(day == 7) {
		System.out.println("Saturday");
		num1++;
		num2++;
		}

		System.out.println(num1);//11
        System.out.println(num2);//20
	}
}
