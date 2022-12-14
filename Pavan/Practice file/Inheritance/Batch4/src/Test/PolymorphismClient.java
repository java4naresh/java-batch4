package Test;

import polymorphism.Arithmetic;
import polymorphism.Child;
import polymorphism.Child2;
import polymorphism.Parent;

public class PolymorphismClient {
	public static void main(String[] args) {
		Arithmetic a = new Arithmetic();
		a.sum(10,20);
		System.out.println(a.sum(10, 20));
		a.sum(10, 20, 30);
		System.out.println(a.sum(10, 20, 30));
		a.sum(30, 40, 60, 70);
		System.out.println(a.sum(30, 40, 60, 70));
	
	    Parent p = new Parent();
        p.useLand();
        Parent p1 = new Child();
        p1.useLand();
        Parent p2 = new Child2();
        p2.useLand();
}
}