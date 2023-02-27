package multithreading;

public class Task {
	
	
	
	public synchronized void print1to1000() {
		for(int i=1; i<11; i++) {
			System.out.println("11*"+i+"="+i*11);
		}
	}
	
	public synchronized static void print1to100() {
		for(int i=1; i<11; i++) {
			System.out.println("11*"+i+"="+i*11);
		}
	}

}
