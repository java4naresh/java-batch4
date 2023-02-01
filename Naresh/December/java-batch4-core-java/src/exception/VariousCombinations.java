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

	}

}
