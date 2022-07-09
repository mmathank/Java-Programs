package core.java.thread.concepts;

class PrintNumbers implements Runnable {
	
	String threadName;
	
	public PrintNumbers(String threadName) {
		this.threadName = threadName;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(threadName + " " + i);
		}
	}
}

public class ThreadExample1 {

	public static void main(String[] args) {

		PrintNumbers pn = new PrintNumbers("First-Thread");
		Thread thread1 = new Thread(pn);
		thread1.start();

		new Thread(new PrintNumbers("Second-Thread")).start();

//		Anonymous Implementation
		Thread pn2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					System.out.println("Third-Thread: " + i);
				}
			}

		});
		pn2.start();
	}
}
