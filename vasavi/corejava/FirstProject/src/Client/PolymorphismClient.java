package client;

import polymorphism.Arithmetic;
import polymorphism.Child;
import polymorphism.Child2;
import polymorphism.Parent;

public class PolymorphismClient {

	public static void main(String[] args) {
		Parent p = new Child();
		p.useLand();
		Parent p2 = new Parent();
		p2.useLand();
		Parent p3 = new Parent();
		p3.useLand();
		
		Arithmetic arth = new Arithmetic();
		arth.sum(10,  20);
		arth.sum(10,  20, 30);
		arth.sum(10,  20, 30, 40);

	}

}

