package tasks;

public class ArraystoreExceptionExample {

	public static void main(String[] args) {
		Number[] numArray = new Double[2];
		numArray[0] = 24; //int converted into double
		System.out.println(numArray[0]);
		
	}

}
