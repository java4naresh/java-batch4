package Client;

public class LowerCaseExample {

	public static void main(String[] args) {
		String name = "DHANALAKSHMI";
		char[] lowercasename = new char[name.length()];
		for(int i = 0; i < name.length(); i++) {
		 
		int ascivalue = name.charAt(i);
		lowercasename[i] = (char)(ascivalue +32);
		
		}
		 for(int i =0; i < name.length(); i++) {
			 System.out.println(lowercasename[i]);
			 
		 }
		
	}

}
