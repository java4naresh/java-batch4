package multiThreading;

public class NotifyAllThread extends Thread{
	
WaitNotifyNotifyAllThread thread;
	
	public NotifyAllThread(WaitNotifyNotifyAllThread thread) {
		this.thread =  thread;
	}
	
   @Override
	public void run() {
		synchronized(thread) {
		try {
			thread.wait();//naresh2 thread will wait
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(thread.getI());
		}
	}
	

}
