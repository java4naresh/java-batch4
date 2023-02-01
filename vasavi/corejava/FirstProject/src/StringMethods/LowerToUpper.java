package StringMethods;

public class LowerToUpper {

	public static void main(String[] args) {
		String name = "vasavi";
		char[] uppercase=new char[name.length()];
		for (int i=0 ; i<name.length();i++) {
	
			int ascivalue=name.charAt(i);
			uppercase[i]=(char)(ascivalue-32);
		}
		for(int i=0 ; i<name.length();i++) {
			System.out.print(uppercase[i]);
		}

	}
}


