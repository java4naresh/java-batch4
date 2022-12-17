package Client;

public class NewStringExample {

	public static void main(String[] args) {
		String name = new String("Dhana");
		String name2 = new String("Dhana");
		String name3 = "Dhana";
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
	
	String name4 = "dhana";
    System.out.println(name4.lastIndexOf("a"));//4
    
    String name5 = "dhana";
    char ch = name5.charAt(1);
    System.out.println(ch);//h
    
    System.out.println(name.compareTo(name2));
    System.out.println(name.compareTo(name3));
    System.out.println(name.compareTo(name4));
    
    System.out.println(name.compareToIgnoreCase(name4));
    
    String a = "dhana";
    String b = "mannem";
    System.out.println(a.concat(b));//dhanamannem
    
    System.out.println(a.contains("dhan"));
	System.out.println(a.contains("aa"));
	System.out.println(a.contains("a"));
	
	System.out.println(a.contentEquals("dhana"));
	System.out.println(a.contentEquals("dha"));
	
	System.out.println(a.endsWith("dha"));
	System.out.println(a.endsWith("na"));
	System.out.println(a.endsWith("a"));
	
	String s = "I had completed my degree recently";
	System.out.println(s.indexOf("completed"));
	System.out.println(a.indexOf("re"));
	System.out.println(s.lastIndexOf("y"));

    
     
	}

}
