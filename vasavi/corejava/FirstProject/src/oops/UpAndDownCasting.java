package oops;

public class UpAndDownCasting {
	
	public static void main(String[] args) {
		Parent p = new Child(); ///up casting
		
		System.out.println(p.parentAge);
		System.out.println(p.parentName);
		
		Child ch = (Child)p; //down casting
		System.out.println(ch.parentAge);
		System.out.println(ch.parentName);
		System.out.println(ch.childAge);
		System.out.println(ch.childName);
	// Child ch = new Parent(); //not possible due to data loss
	}

}
