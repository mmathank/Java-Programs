package core.java.thread.concepts;

public class DeadlockExample {

    public static void main(String[] args) {

        Object resource1 = new Object();
        Object resource2 = new Object();

        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread-1 is running");
                    System.out.println("Thread-1 is waiting for resource 2");

                    synchronized (resource2) {
                        System.out.println("Resource 2 acquired - No DeadLock - Thread-1 Completed");


                    }
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread-2 is running");
                    System.out.println("Thread-2 is waiting for resource 1");

                    synchronized (resource1) {
                        System.out.println("Resource 1 acquired - No DeadLock - Thread-2 Completed");


                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}


