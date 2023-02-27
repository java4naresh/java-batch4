package multiThreading;

public class Test {
	
	public static void main(String[] args) {
		Task task = new Task();
		TaskImplementation ti = new TaskImplementation(task);
		ti.start();
		TaskImplementation ti2 = new TaskImplementation(task);
		ti2.start();
		TaskImplementation ti3 = new TaskImplementation(task);
		ti3.start();
		TaskImplementation ti5 = new TaskImplementation(task);
		ti5.start();
		TaskImplementation ti6 = new TaskImplementation(task);
		ti6.start();
		TaskImplementation ti7 = new TaskImplementation(task);
		ti7.start();
		TaskImplementation ti8 = new TaskImplementation(task);
		ti8.start();
		TaskImplementation ti9 = new TaskImplementation(task);
		ti9.start();
		TaskImplementation ti10 = new TaskImplementation(task);
		ti10.start();
		TaskImplementation ti11 = new TaskImplementation(task);
		ti11.start();
		TaskImplementation ti12 = new TaskImplementation(task);
		ti12.start();
		TaskImplementation ti13 = new TaskImplementation(task);
		ti13.start();
		TaskImplementation ti14 = new TaskImplementation(task);
		ti14.start();
		TaskImplementation ti15 = new TaskImplementation(task);
		ti15.start();
		TaskImplementation ti16 = new TaskImplementation(task);
		ti16.start();
		TaskImplementation ti17 = new TaskImplementation(task);
		ti17.start();
		TaskImplementation ti18 = new TaskImplementation(task);
		ti18.start();
		TaskImplementation ti19 = new TaskImplementation(task);
		ti19.start();
		TaskImplementation ti20 = new TaskImplementation(task);
		ti20.start();
		TaskImplementation ti21 = new TaskImplementation(task);
		ti21.start();
        task.print1to1000();
	}

}
