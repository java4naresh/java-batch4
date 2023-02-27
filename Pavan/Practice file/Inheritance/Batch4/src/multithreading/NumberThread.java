package multithreading;

public class NumberThread extends Thread {
	
	 public void run() {
		 int n =9;
		 for(int i=0; i<n; i++) {
				System.out.println(i+" "+ Thread.currentThread().getName());
	    }
		 
	 }
}
