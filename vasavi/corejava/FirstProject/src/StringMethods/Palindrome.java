package StringMethods;

public class Palindrome {
	

		public static void main(String[] args) {
			String names="amma nanna akka thammudu";
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
			
 }
}




