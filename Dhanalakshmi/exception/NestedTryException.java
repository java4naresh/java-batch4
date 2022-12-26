package exception;

public class NestedTryException {

	private static char[][] numArray;
	private static char[] name;
	private Object arr;

	public static void main(String[] args) {
		try {
			try {
			int num = 10/0;	
			} catch(ArithmeticException ae) {
				System.out.println("AE1");
			}
			String name = null;
			name.charAt(1);	
		} catch(ArithmeticException ae) {
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
			try {
				try {
					Number[] numArray = new Double[2];
					numArray[0] = 4;//4d
				} catch(ArrayStoreException ase) {
					System.out.println(numArray[0]);
				}
				String name ="Dhana12";
				name.charAt(9);
			} catch(StringIndexOutOfBoundsException siob) {
				System.out.println(name);
			} catch(Exception e) {
				try {
					int []arr = {1,2,3};
					int num = arr[4];
				} catch(ArrayIndexOutOfBoundsException aiob) {
					System.out.println("AIOB");
				}
				System.out.println("AE3");
			}
			System.out.println("finally");
			}
		}
		
	}
	
