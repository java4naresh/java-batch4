package multiThreading;

public class DeamonThread {
	
	public static void main(String[] args) {

		System.out.println(Thread.currentThread().isDaemon());
		MyThread mt = new MyThread();
		mt.setName("vasavi");
		mt.setDaemon(true);
		mt.start();
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
	}

}
