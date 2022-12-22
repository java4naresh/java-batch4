package exception;

public class ExceptionHandilingExample {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		//System.out.println(10/0);
		System.out.println(10/1);
		System.out.println(10/2);
		System.out.println(10/3);
		System.out.println(10/4);
		String name = null;
		try {
			System.out.println(name.charAt(1));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		
		}
	}

}
