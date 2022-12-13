package Client;

import polymorphism.Arithmetic;
import polymorphism.Child2;
import polymorphism.child;
import polymorphism.parent;

public class PolymorphismClient {

	public static void main(String[] args) {
		parent p = new child();
        p.useLand();
        parent p2 = new Child2();
        p2.useLand();
        parent p3 = new parent();
        p3.useLand();
        
        Arithmetic arth = new Arithmetic();
        arth.sum(10, 20);
        arth.sum(10, 20, 30);
        arth.sum(10, 20, 30, 40);
	}

}
