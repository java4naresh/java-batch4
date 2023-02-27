package multithreading;

public class MyThreadUsingRunnable implements Runnable{

	@Override
	public void run() {
		/*try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		//System.out.println(Thread.currentThread().getPriority());
		//Thread.yield();
		//Thread.yield();
		for(int i=501; i<1001; i++) {
			System.out.println(i+" "+ Thread.currentThread().getName());
		}
		
	}

}
