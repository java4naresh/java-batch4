package multiThreading;

public class WaitNotifyNotifyAllThread extends Thread{
	
	
int i=0;
	
	@Override
	public void run() {
		synchronized(this) {
		
		for(int j = 1; j < 501; j++) {
			i = i+j;
		}
		//System.out.println(i);
		//this.notify();
		this.notifyAll();
		}
	}
	
	public int getI() {
		return i;
	}


}
