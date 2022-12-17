package stringMethods;

public class InternExample {

	public static void main(String[] args) {
		String name = new String("Gnana vikas");
		String name1 = new String ("Gnana Vikas");
		String name2 = new String ("GNANA VIKAS");
		String name4 = "Gnana vikas";
		System.out.println(name);
		System.out.println(name1);
		System.out.println(name2);
		name = name.intern();
		if (name == name4) { System.out.println("Same");
		}
		else {
			System.out.println("Not Same");
		}
		
	}

}
