package exception;

public class VariousCombinations {

	public static void main(String[] args) {
		
		/*int num1 = 10;
		int num2 = 0;
		if(num1 == 0 || num2 == 0) {
			throw new ArithmeticException("Division with zero not possible");
		}
		int div = num1 / num2;*/
		
		String email = "";
		if(email.isEmpty() || !email.contains("@") || !email.endsWith(".com")) {
			throw new EmailValidationException("Email is not valid");
		}
			
		/*String name = "";
		if(name.isEmpty() || name.endsWith("d")) {
			throw new RuntimeException("name is not valid");
		}*/
		 
		/*String name1 = null;
		if(name1.startsWith(name1)) {
			throw new NullPointerException("Name is null");
		}*/
		/*int[] numbers = {1,2,3,4};
		if(numbers.equals(numbers[9]) ) {
			throw new NumberInvalidException("Number is invalid");
		}*/
		
	}

}
