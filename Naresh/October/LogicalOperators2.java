class LogicalOperators2 
{
	public static void main(String[] args) 
	{
		if(true || true) {
		System.out.println("Sample Output");
		}

		int num1 = 10;
		int num2 = 20;

		/*if(++num1 == 12 || ++num2 == 21) {
		System.out.println(num1); //11
		System.out.println(num2); //21
		}*/

		if(++num1 == 12 && ++num2 == 21) {
		
		}

        System.out.println(num1); //11
		System.out.println(num2); //20
	}
}
