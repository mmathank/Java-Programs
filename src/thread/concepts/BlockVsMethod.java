package core.java.thread.concepts;

public class BlockVsMethod {

	int counterForA = 0;
	int counterForB = 0;

	Object lock1 = new Object();
	Object lock2 = new Object();

	public void methodA() {
		System.out.println("Instructions from Method A");
		System.out.println("Starting.. Method A..");
		System.out.println("Processing.. Method A..");
		System.out.println("Completing.. Method A..");
		
		synchronized (lock1) {
			for (int i = 0; i < 10; i++) {
				counterForA++;
				System.out.println("Method A: " + counterForA);
			}
			System.out.println("counterForA: " + counterForA);
		}
	}

	public void methodB() {
		System.out.println("Instructions from Method B");
		System.out.println("Starting.. Method B..");
		System.out.println("Processing.. Method B..");
		System.out.println("Completing.. Method B..");

		synchronized (lock2) {
			for (int i = 0; i < 10; i++) {
				counterForB++;
				System.out.println("Method B: " + counterForB);
			}
			System.out.println("counterForB: " + counterForB);
		}

	}

	public synchronized void methodC() {
		
		System.out.println("Instructions from Method C");
		System.out.println("Starting.. Method C..");
		System.out.println("Processing.. Method C..");
		System.out.println("Completing.. Method C..");
		
		for (int i = 0; i < 10; i++) {
			counterForA++;
			System.out.println("Method C: " + counterForA);
		}
		System.out.println("counterForC: " + counterForA);
	}

	public synchronized void methodD() {
		System.out.println("Instructions from Method D");
		System.out.println("Starting.. Method D..");
		System.out.println("Processing.. Method D..");
		System.out.println("Completing.. Method D..");

		for (int i = 0; i < 10; i++) {
			counterForB++;
			System.out.println("Method D: " + counterForB);
		}
		System.out.println("counterForD: " + counterForB);

	}

	public static void main(String[] args) {

		BlockVsMethod bvm = new BlockVsMethod();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				bvm.methodA();
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				bvm.methodB();
			}
		});
		
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				bvm.methodC();
			}
		});

		Thread t4 = new Thread(new Runnable() {
			@Override
			public void run() {
				bvm.methodD();
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
		
		t3.start();
		t4.start();
		
		try {
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
