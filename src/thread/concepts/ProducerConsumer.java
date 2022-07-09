package core.java.thread.concepts;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {

	List<Integer> numberList = new ArrayList<>();
	int value = 0;
	Object lock = new Object();

	public void produce() throws InterruptedException {

		synchronized (lock) {
			for (int i = 0; i < 5; i++) {
				value++;
				numberList.add(value);
				System.out.println(value);
				Thread.sleep(1000);
			}
			lock.wait();
		}
	}

	public void consume() throws InterruptedException {

		Thread.sleep(1000);

		synchronized (lock) {
			if (numberList.size() == 5) {
				for (int i = 4; i >=0; i--) {
					System.out.println(numberList.remove(i));
					Thread.sleep(1000);
				}
			} else {
				lock.wait();
			}
			lock.notify();
		}
	}

	public static void main(String[] args) {

		ProducerConsumer pc = new ProducerConsumer();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					pc.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
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
