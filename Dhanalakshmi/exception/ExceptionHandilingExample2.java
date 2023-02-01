package exception;

public class ExceptionHandilingExample2 {

	public static void main(String[] args) {
		/*try {
			String name = null;
			name.charAt(2);
		} catch(ArithmeticException e){
			
		} catch(NullPointerException e){
			
		} catch(Exception e){
			
		} finally {
			System.out.println("Cleanup");
		}*/
  
		System.out.println(getDivisionNumber());
	}

	public static int getDivisionNumber() {
		try {
			return 10/0;
		} catch(ArithmeticException e) {
			return 0;
		} finally {
			
		}
	}
			
}
