package core.java.thread.concepts;

class Runner implements Runnable {

//	volatile usage
	volatile boolean flag;
	
	public void run () {
		System.out.println("Inside Run Method");
		
		while (!flag) {
			try {
				Thread.sleep(1000);
				System.out.println("Running..");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void changeFlag(boolean flag) {
		this.flag = flag;
	}

}

public class VolatileExample {

	public static void main(String[] args) {

		Runner r1 = new Runner();
		Thread t1 = new Thread(r1);
		t1.start();
		try {
			Thread.sleep(5000);
			r1.changeFlag(true);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Task Finished");
	}

}
