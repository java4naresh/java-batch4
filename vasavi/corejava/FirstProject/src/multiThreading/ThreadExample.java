package multiThreading;

public class ThreadExample {
	
	public static void main (String[] args) {
		// thread created or born
				MyThread mt = new MyThread();
				mt.setName("Vasavi");
				mt.start();//ready
				//MyThread mt2 = new MyThread();
				//mt2.setName("Vasavi");
				//mt2.start();
				//mt.start();
				//mt.start("Vasavi");
				//mt.run("Vasavi");
				//System.out.println(Thread.currentThread().getName());
				for(int i=1; i<501; i++) {
					System.out.println(i+" "+ Thread.currentThread().getName());
				}

	
		
	
	}

}
