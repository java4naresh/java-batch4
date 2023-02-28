package multithreading;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		WaitNotifyNotifyAllThread thread = new WaitNotifyNotifyAllThread();
		thread.setName("naresh");
		thread.start();
		synchronized(thread) {
		thread.wait();// main thread will wait
		System.out.println(thread.getI());
		NotifyAllThread nthread = new NotifyAllThread(thread);
		nthread.setName("naresh2");
		nthread.start();
		}
		
	
	}

}
