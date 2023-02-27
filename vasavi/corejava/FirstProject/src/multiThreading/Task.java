package multiThreading;

public class Task {

	
	public synchronized void print1to1000() {
		for(int i=1; i<11; i++) {
			System.out.println("10*"+i+"="+i*10);
		}
	}
	
	public synchronized static void print1to100() {
		for(int i=1; i<11; i++) {
			System.out.println("10*"+i+"="+i*10);
		}
	}
	
	
}
