package stringMethods;

public class EqualsIgnoreCase {
	public static void main(String[] args) {
		String name = new String ("Pardhu");
		String name1 = new String ("pardhu");
		if(name.equalsIgnoreCase(name1)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Not Same");
		}
	}
	

}
