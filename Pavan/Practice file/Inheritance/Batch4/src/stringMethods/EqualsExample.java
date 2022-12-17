package stringMethods;

public class EqualsExample {

	public static void main(String[] args) {
		String name = "Hello";
		String name1 = "hello";
		String name2 = "Pavan";
		String name3 = "Pavan";
		System.out.println(name.equals(name2));
		System.out.println(name2.equals(name3));
		System.out.println(name1.equals(name3));

	}

}
