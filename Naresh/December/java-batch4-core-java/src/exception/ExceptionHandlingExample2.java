package exception;

public class ExceptionHandlingExample2 {

	public static void main(String[] args) {
		    /*try{
			String name = null;
			name.charAt(1);
			} catch(ArithmeticException e) {

			} catch(NullPointerException e) {

			} catch(Exception e) {

			} finally {
			System.out.println("Cleanup");
			}*/
		
		System.out.println(getDivisionNumber());//1
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
