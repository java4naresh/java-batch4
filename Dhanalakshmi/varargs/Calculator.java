package varargs;

public class Calculator {

	public static int sum(int... numbers) {
		int sum = 0;
		//for each
		for(int number: numbers) {
			sum = sum + number;
		}
	
		return sum;
	}
	
	/*public static int sum(int num) {
		System.out.println("sum(num)");
		return num;
		
	}
	
	public static int sum(int num1,int num2) {
		System.out.println("sum(num1,num2)");
		return num1 + num2;
		
	}*/
}
