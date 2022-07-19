package core.java.thread.concepts;

import java.util.stream.IntStream;

public class PrintOddEvenNumbers {

    public static void main(String[] args) {
        System.out.println("Main Thread Started");
        PrintOddEvenNumbers poe = new PrintOddEvenNumbers();

        Thread t1 = new Thread(() -> {
            poe.printOddNumbers();
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                poe.printEvenNumbers();
            }
        });

        t1.start();
        t2.start();

        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread Completed..");
    }

    public synchronized void printOddNumbers() {
        IntStream.rangeClosed(1, 50)
                 .filter(x -> x % 2 != 0)
                 .forEach(System.out::println);
    }

    public synchronized void printEvenNumbers() {
        IntStream.rangeClosed(1, 50)
                 .filter(x -> x % 2 == 0)
                 .forEach(System.out::println);
    }
}
