package multithreading;

public class ThreadExample1 implements Runnable {
	@Override
    public void run() {
    }
    public static void main(String[] args) {
        Thread tr = new Thread();
        tr.start();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
  }

}
