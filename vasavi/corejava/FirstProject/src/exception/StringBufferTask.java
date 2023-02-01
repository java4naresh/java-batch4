package exception;

public class StringBufferTask {

		public static void main(String[] args) {
			String name = "Naresh123";
			System.out.println(name.substring(6));
	        
			 String name1 = "vasaviperumalla@gmail.com";
			 System.out.println(name1.substring(6));//perumalla@gmail.com
			 System.out.println(name1.substring(0, 6));//vasavi
			 System.out.println(name1.subSequence(6, 18));//perumalla@gm
			 System.out.println(name1.subSequence(15, 22));//@gmail.
			 System.out.println(name1.substring(18, 25));//ail.com

}
}


