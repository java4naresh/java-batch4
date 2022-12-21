package Client;

public class SplitStringBufferTask {

	public static void main(String[] args) {
		String names = "Amma Nanna Akka Anna Thammudu";
		   String arr[] = names.split(" ");//
		    
		   for(int i = 0; i< arr.length; i++) {
			   StringBuffer sb = new StringBuffer(arr[i]);
			   sb.reverse();
			   System.out.println(sb);
			   String pa = sb.toString();
			   if(arr[i].equals(pa)) {
				 System.out.println("Palindrome");  
			   } else {
				   System.out.println("Not Palindrome");  
			   }
		
		   }

	}

}
