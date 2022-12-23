package tasks;

public class LowerCaseExample {

	public static void main(String[] args) {
		String name = "NARESHJAVA";
		char[] uppercasename=new char[name.length()];
		for (int i=0 ; i<name.length();i++) {
	
			int ascivalue=name.charAt(i);
			uppercasename[i]=(char)(ascivalue+32);
		}
		for(int i=0 ; i<name.length();i++) {
			System.out.print(uppercasename[i]);
		}

	}

}
