package multithreading;

public class ThreadExample2 {

	public static void main(String[] args) {
		MyThreadUsingRunnable thread = new MyThreadUsingRunnable();
		Thread myThread = new Thread(thread);
		myThread.setName("Naresh");
		myThread.start();
	}

}
