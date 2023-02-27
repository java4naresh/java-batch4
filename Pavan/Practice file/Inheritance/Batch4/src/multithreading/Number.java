package multithreading;

public class Number {

	public static void main(String[] args) {
		
        	NumberThread nt = new NumberThread();
        	nt.setName("Pavan");
            nt.start();
            int n = 9; // Number of threads
            for (int i=0; i< n; i++) {
            	System.out.println(n+" "+ Thread.currentThread().getName());
        }

	}

}
