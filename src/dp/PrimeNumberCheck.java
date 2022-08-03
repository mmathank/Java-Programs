package core.java.dp;

import java.util.stream.IntStream;

public class PrimeNumberCheck {
    public static void main(String[] args) {
//        System.out.println(isPrimeNumber(7));
        IntStream numbers = IntStream.rangeClosed(1, 100);
        numbers.filter(PrimeNumberCheck::isPrimeNumber)
               .forEach(System.out::println);
    }

    private static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
