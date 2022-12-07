package oops;

public class PublicAccessModifierExample {
	
  private String name1;
  String name2;
  protected String name3;
  public String name4;
  
  private PublicAccessModifierExample() {
	  
  }
  
  private static String getName1() {
	  return "Naresh";
  }
  
  static String getName2() {
	  return "Naresh";
  }
  
  protected static String getName3() {
	  return "Naresh";
  }
  
  public static String getName4() {
	  return "Naresh";
  }
  
  public static void main(String[] args) {
	    PublicAccessModifierExample pame = new PublicAccessModifierExample();
      //System.out.println(pame.name);
		System.out.println(pame.name1);
		System.out.println(pame.name2);
		System.out.println(pame.name3);
		System.out.println(pame.name4);
		PublicAccessModifierExample.getName1();
		PublicAccessModifierExample.getName2();
		PublicAccessModifierExample.getName3();
		PublicAccessModifierExample.getName4();
	}

}
