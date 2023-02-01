package oops;

 public class PublicAccessModifier {
   
	 private String name1;
	 String name2;
	 protected String name3;
	 public String name4;
	 
	 public PublicAccessModifier(){
	 }
	 
	 private static String getName1() {
		 return "vasavi";
	 }
	 
	 static String getName2() {
		 return "vasavi";
	 }
	  
	 public static String getName3() {
			 return "vasavi";
	 }
	 protected static String getName4() {
		 return "vasavi";
	 }
	 
	 public static void main(String[] args) {
		 PublicAccessModifier pa= new PublicAccessModifier();	
			System.out.println(pa.name1);
	        System.out.println(pa.name2);
	        System.out.println(pa.name3);
	        System.out.println(pa.name4);
	        PublicAccessModifier.getName1();
	        PublicAccessModifier.getName2();
	        PublicAccessModifier.getName3();
	        PublicAccessModifier.getName4();
		}
	 
}
