package core.java.thread.concepts;

public class SynchronizedExample {
    int count = 0;
    public static void main(String[] args) {

        SynchronizedExample se = new SynchronizedExample();

        Thread t1 = new Thread(() -> {
            System.out.println(se.getNextValue());
        });

        Thread t2 = new Thread(() -> {
            System.out.println(se.getNextValue());
        });

        t1.start();
        t2.start();
    }

    public synchronized int getNextValue() {
        for (int i = 0; i < 10; i++) {
            count++;
        }
        return count;
    }
}
