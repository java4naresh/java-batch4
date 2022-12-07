package oops;

public class PublicAccessModifier {

	private String name1;
    String name2;
	protected String name3;
	public String name4;
	
	private PublicAccessModifier() {
		
	}
	
	private static String getName1() {
		return "Dhana";
	}
	
	static String getName2() {
		return "Dhana";
	}
	
	protected static String getName3() {
		return "Dhana";
	}
	
	public static String getName4() {
		return "Dhana";
	}
	public static void main(String[] args) {
		  PublicAccessModifier pam = new PublicAccessModifier();
	      //System.out.println(pam.name);
		  System.out.println(pam.name1);
		  System.out.println(pam.name2);
		  System.out.println(pam.name3);
		  System.out.println(pam.name4);
		  PublicAccessModifier.getName1();
		  PublicAccessModifier.getName2();
		  PublicAccessModifier.getName3();
		  PublicAccessModifier.getName4();
 }
}
