package Multithreading;

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadExample2 thread2=new threadExample2();
		//thread2.run();
		thread2.start();
		/*
		 * for(int i=0;i<500; i++) {
		 * System.out.println(i+"="+Thread.currentThread().getName()); }
		 */
		//m1();
	}
	static void m1()
	{
		System.out.println(Thread.currentThread().getName());
	}

}
