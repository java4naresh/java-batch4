package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		/*try {
		System.out.println(10/0);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(10/1);
		System.out.println(10/2);
		System.out.println(10/3);
		System.out.println(10/4);
		String name = null;
		try {
		System.out.println(name.charAt(1));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}*/
		polindrome();
		alphanumeric();

	}
	
	public void fileNotFound() {
		File f = new File("");
		
			FileReader fr = new FileReader(f);
		
	}
	
	public static void polindrome() {
		//try {
		String names="Amma Nanna Akka Anna Thammudu";
		String arr[] = names.split(" ");
		for(int i=0; i< arr.length; i++) {
			StringBuffer sb =  new StringBuffer(arr[i]);
			sb.reverse();
			System.out.println(sb);
			String pa = sb.toString();			
			if(arr[i].equals(pa)) {
				System.out.println("palindrome");
			}else {
				System.out.println("not a palindome");
			
			}		
	       }
		//} catch(Exception e) {
		//	System.out.println(e.getMessage());
		//} finally {
		//	System.out.println("finally");
		//}
	}
	
	public static void alphanumeric() {
		String name = "naresh123";
		String regex="^[(a-zA-Z0-9)]*$";
		boolean flag=name.matches(regex);
		if(flag) {
			System.out.println("this is a alphanumeric");
		}else {
			System.out.println("not a alphanumeric");
		}
	}

}
