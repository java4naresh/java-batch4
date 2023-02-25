package multithreading;

public class ThreadExampple {

	public static void main(String[] args) {
		// thread created or born
		MyThread mt = new MyThread();
		mt.setName("Naresh");
		mt.start();//ready
		//MyThread mt2 = new MyThread();
		//mt2.setName("Naresh2");
		//mt2.start();
		//mt.start();
		//mt.start("Naresh");
		//mt.run("Naresh");
		//System.out.println(Thread.currentThread().getName());
		for(int i=1; i<501; i++) {
			System.out.println(i+" "+ Thread.currentThread().getName());
		}

	}
	
	

}
