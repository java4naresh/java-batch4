package Client;

public class PolindromeExa {

	public static void main(String[] args) {
		String name = "amma";
		String rev = "";
		for(int i = name.length()-1; i > 0; i--) {
			rev = rev + name.charAt(i);
		}
		if (name.equalsIgnoreCase(rev)) {
			System.out.println("its a polindrome");
		} else {
			System.out.println("not a polindrome");
		}

	}

}
