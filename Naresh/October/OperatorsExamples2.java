class OperatorsExamples2 
{
	public static void main(String[] args) 
	{
		int num1 = 5;
		int num2 = 5;

		//Arithmetic Operators
		int sum = num1 + num2;//10
        int substraction = num1 - num2;//0
		int mul = num1 * num2;//25
		int coef = num1 / num2;//1
		int rem = num1 % num2;//0
		System.out.println("sum = "+sum);//
        System.out.println("substraction = "+substraction);
        System.out.println("mul = "+mul);
		System.out.println("coef = "+coef);
		System.out.println("rem = "+rem);
        System.out.println((int)'c');
		System.out.println('c' + 'c');//
		// byte + byte = int
		// short + byte = int
		// int + short = int
		// long + int = long
		// char + char = int
		byte num3 = 2;
		byte num4 = 5;
		int res = num3 + num4;
	}
}
