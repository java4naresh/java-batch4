package multiThreading;

public class TaskImplementation extends Thread {
	
		
		private Task task;
		
		public TaskImplementation(Task task) {
			this.task = task;
		}
		
		public void run() {
			task.print1to1000();
		}


}
