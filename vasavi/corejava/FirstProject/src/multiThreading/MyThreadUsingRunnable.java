package multiThreading;

public class MyThreadUsingRunnable implements Runnable{

	
	
	@Override
	public void run() {
		/*try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		for(int i=501; i<1001; i++) {
			System.out.println(i+" "+ Thread.currentThread().getName());
		}
		
	}
}
