package core.java.dp;
public class Factorial {

    public static void main(String[] args) {
        System.out.println(findFactorialUsingRecursion(5));
        System.out.println(findFactorialUsingIteration(5));
    }

    private static int findFactorialUsingRecursion(int number) {
        if (number == 1) {
            return 1;
        }
        return number * findFactorialUsingRecursion(number - 1);
    }

    private static int findFactorialUsingIteration(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
