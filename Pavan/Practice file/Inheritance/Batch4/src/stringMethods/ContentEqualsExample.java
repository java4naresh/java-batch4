package stringMethods;

public class ContentEqualsExample {

	public static void main(String[] args) {
		String name = "Triveni";
		String name1 = "Triveni";
		String name2 = "TRIVENI";
		String name3 = "TRIVENI";
		System.out.println(name.contentEquals(name2));
		System.out.println(name2.contentEquals(name3));
		System.out.println(name1.contentEquals(name3));
		System.out.println(name3.contentEquals(name2));
		

	}

}
