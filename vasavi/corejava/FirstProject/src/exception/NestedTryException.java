package exception;

public class NestedTryException {
	
	public static void main(String[] args) {
		try {
			try {
			int num = 20 / 0;	
			} catch(ArithmeticException ae) {
				System.out.println("AE1");
			}
			
		  String name = null;
		  name.charAt(1);
		} catch(ArithmeticException e) {
			try {
				int []arr = {1};
				int num = arr[2];
			} catch(ArrayIndexOutOfBoundsException aiob) {
				System.out.println("AIOB");
			}
			System.out.println("AE2");
		} catch(NullPointerException e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}

	}


}
