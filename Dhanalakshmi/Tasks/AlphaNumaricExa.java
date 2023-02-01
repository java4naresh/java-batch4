package Client;

public class AlphaNumaricExa {

	public static void main(String[] args) {
		String name = "Dhana123";
		String regex="[(a-zA-Z0-9)]*$";
		boolean flag = name.matches(regex);
		
		if(flag) {
			System.out.println("This is alphanumaric");
		} else {
			System.out.println("Not a alphanumaric");
		}

	}

}
