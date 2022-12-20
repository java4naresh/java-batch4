package test;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Naresh");
		System.out.println(sb);
		sb.append(" Kambala");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		
		String name = "Naresh";
		System.out.println(name);
		name.concat(" Kambala");
		System.out.println(name);
	}

}
