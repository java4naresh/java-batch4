package tasks;

public class AlphaNumeric {

	public static void main(String[] args) {

		String name = "naresh123";
		String regex="^[a-zA-Z0-9]*$";
		boolean flag=name.matches(regex);
		if(flag) {
			System.out.println("this is a alphanumeric");
		}else {
			System.out.println("not a alphanumeric");
		}
	}

}
