package core.java.thread.concepts;

public class SynchronizedExample {

	int count = 0;
	
	public void method1() {
		synchronized(this) {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
				count++;
			}
			System.out.println("Method 1: " + count);
		}
	}

	public void method2() {
		synchronized(this) {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
				count++;
			}
			System.out.println("Method 2: " + count++);
		}
	}

	public static void main(String[] args) {

		SynchronizedExample se = new SynchronizedExample();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				se.method1();
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				se.method2();
			}
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
