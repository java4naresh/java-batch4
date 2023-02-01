package exception;

public class ClassCastExceptionClient {

	public static void main(String[] args) {
		Parent p = new Person();
		Child ch = (Child)p;
		Person person = (Person)p;

	}

}
