package tasks;

class Animal {
	
}
class Dog extends Animal {
	
}
class Cat extends Animal{
	
}
public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Animal dog = new Dog ();
		Animal cat = new Cat ();
		
		Cat cat1 = (Cat)dog;
		System.out.println("done");
	}
}
