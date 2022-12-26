package exception;

public class VariousCombinations {
	
	public static void main(String[] args) {
		
		/*try {
			try {
				
			}
					
		} finally {
			
		}
		catch(NullPointerException  npe) {
			
			System.out.println("msg");	
		}  finally {
			
		}*/
		
		/*int num1 = 20;
		int num2 = 0;
		if(num1==0  || num2==0){
			throw  new ArithmeticException("divison with zero is not possible");
			
		}
		int div = num1/num2;*/
		
		String email="vasavi@gmail.com";
		//String email = "null";
		if(email.isEmpty() || !email.contains("@") && !email.contains("gmail") || !email.endsWith(".com")){
			throw new  EmailValidationException("Email is not vaild");
		}
		
		}
	}


