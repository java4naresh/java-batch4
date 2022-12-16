package test;

public class NewStringExample {

	public static void main(String[] args) {
		String name = new String("Naresh");
		String name2 = new String("Naresh");
		String name3 = "Naresh";
		System.out.println(name);
		System.out.println(name2);
		if(name.equalsIgnoreCase(name2)) {
			System.out.println("Same");
		} else {
			System.out.println("Not Same");
		}
		
		if(name == name2) System.out.println("same");
		if(name == name3) System.out.println("same");
		name = name.intern();
		if(name == name3) System.out.println("same");
		String name4 = "pavan";
		System.out.println(name4.lastIndexOf("a"));

	}

}
