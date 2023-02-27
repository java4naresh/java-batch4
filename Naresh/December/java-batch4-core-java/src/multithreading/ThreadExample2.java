package multithreading;

public class ThreadExample2 {

	public static void main(String[] args) {
		MyThreadUsingRunnable thread = new MyThreadUsingRunnable();
		Thread myThread = new Thread(thread);
		myThread.setName("Naresh");
		myThread.start();
		try {
			myThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//myThread.setPriority(10);
		
		//System.out.println(Thread.currentThread().getPriority());
		/*try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		for(int i=1;i<501;i++) {
			System.out.println(Thread.currentThread().getName()+ " "+ i);
		}
		
	}

}
