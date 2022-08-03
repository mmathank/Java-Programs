package core.java.dp;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    static Map<Integer, Long> memo = new HashMap<>();

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
//        System.out.println(findFibonacci(60));
        System.out.println(findFibonacciUsingMemoization(60));
        long endTime = System.currentTimeMillis();
        long timeTaken = endTime - startTime;
        System.out.println(timeTaken + " milliseconds");
//        printFibonacci(5);
    }

    public static long findFibonacci(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return findFibonacci(number - 1) + findFibonacci(number - 2);
        }
    }

    public static void printFibonacci(int number) {
        int a = 1;
        int b = 2;
        System.out.println(a);
        System.out.println(b);
        while (number - 2 > 0) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
            number--;
        }
    }

    public static long findFibonacciUsingMemoization(int number) {
        if(number <= 1) {
            return 1;
        }
        if(!memo.containsKey(number)){
            long result = findFibonacciUsingMemoization(number - 1) + findFibonacciUsingMemoization(number - 2);
            memo.put(number, result);
        }
        return memo.get(number);
    }
}
