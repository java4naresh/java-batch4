package Client;

public class StringNameTask {

	public static void main(String[] args) {
		String name = "Naresh123";
		System.out.println(name.substring(6));//123
		//System.out.println(name.substring(0, 6));//Naresh
        
		 String name1 = "mannemdhanalakshmi4@gmail.com";
		 System.out.println(name1.substring(6));//dhanalakshmi4@gmail.com
		 System.out.println(name1.substring(0, 6));//mannem
		 System.out.println(name1.subSequence(6, 18));//dhanalakshmi
		 System.out.println(name1.subSequence(20, 25));//gmail
		 System.out.println(name1.substring(25, 29));//.com
		 
	}

}
