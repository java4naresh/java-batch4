package tasks;

public class StringBufferTask {

	/*public static void main(String[] args) {
		String str = "Naresh123";  
		String[] part = str.split("(?<=\\D)(?=\\d)");  
		//System.out.println(part[0]);  
		System.out.println(part[1]);  
		     }  */
	public static void main(String[] args) {
		StringBuffer name = new StringBuffer("Naresh123");
		//System.out.println(name.subSequence(6, 9));
		System.out.println(name.delete(0, 6));
	}

}

