package client;

public class NewStringExample {
	

		public static void main(String[] args) {
			String name = new String("Vasavi");
			String name2 = new String("Vasavi");
			String name3 = "Vasavi";
			System.out.println(name);
			System.out.println(name2);
			if(name.equalsIgnoreCase(name2)) {
				System.out.println("Same");
			} else {
				System.out.println("Not Same");
			}
			
			if(name == name2) System.out.println("same");
			if(name == name3) System.out.println("same");
			name = name.intern();
			if(name == name3) System.out.println("same");
			
			String name4 = "Sruthi";
			System.out.println(name4.lastIndexOf("u"));
			
			
			String name5="vasu";
			char ch = name5.charAt(1);
			System.out.println(ch);
			
			
			System.out.println(name.compareTo(name2));
			System.out.println(name.compareTo(name3));
			System.out.println(name.compareTo(name4));
			
			System.out.println(name.compareToIgnoreCase(name4));
			
			String a = "vasavi";
			String b ="perumalla";
			System.out.println(a.concat(b));
			
			System.out.println(a.contains("vasa"));
			System.out.println(a.contains("ai"));
			System.out.println(a.contains("a"));
			
			System.out.println(a.contentEquals("vasavi"));
			System.out.println(a.contentEquals("vas"));
			
			System.out.println(a.endsWith("vas"));
			System.out.println(a.endsWith("vi"));
			System.out.println(a.endsWith("i"));
			
			String s = "I had completed my mca recently";
			System.out.println(s.indexOf("completed"));
			System.out.println(a.indexOf("re"));
			System.out.println(s.lastIndexOf("y"));






						
		}

}
