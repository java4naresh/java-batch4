package multiThreading;

public class Test2 {
	
	
	public static void main(String[] args) throws InterruptedException {
		WaitNotifyNotifyAllThread thread = new WaitNotifyNotifyAllThread();
		thread.setName("vasavi");
		thread.start();
		synchronized(thread) {
		thread.wait();// main thread will wait
		System.out.println(thread.getI());
		NotifyAllThread nthread = new NotifyAllThread(thread);
		nthread.setName("vasavi1");
		nthread.start();
		}
		
	
	}

}
