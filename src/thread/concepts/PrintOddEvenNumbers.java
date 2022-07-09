package core.java.thread.concepts;

public class PrintOddEvenNumbers {

	public static void printOddNumbers() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0)
				System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void printEvenNumbers() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
				System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		System.out.println("Main Thread Started");

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				printOddNumbers();
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				printEvenNumbers();
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
		System.out.println("Main Thread Completed..");
	}
}
