package multiThreading;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		/*for(int i=501; i<1001; i++) {
		System.out.println(i+" "+ Thread.currentThread().getName());
	}*/
	run("");
}

public void run(String name) {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	for(int i=501; i<1001; i++) {
		System.out.println(i+" "+ Thread.currentThread().getName());
	}
}

/*@Override
public void start() {
	System.out.println("My name is vasavi");
}*/

public void start(String name) {
	System.out.println(name);
	System.out.println(Thread.currentThread().getName());//main or vasavi
}

	

	

}
