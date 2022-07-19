package core.java.thread.concepts;

public class SynchronizedExample {
    int count = 0;

    public static void main(String[] args) {

        SynchronizedExample se = new SynchronizedExample();

        Thread t1 = new Thread(() -> {
            se.increment(50);
        });

        Thread t2 = new Thread(() -> {
            se.decrement(50);
        });

        t1.start();
        t2.start();
    }

    public synchronized void increment(int value) {
        count += value;
        System.out.println(count);
    }

    public synchronized void decrement(int value) {
        count -= value;
        System.out.println(count);
    }
}
