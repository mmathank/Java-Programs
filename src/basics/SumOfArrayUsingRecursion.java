package core.java.basics;

import java.util.Arrays;

public class SumOfArrayUsingRecursion {

    public static int input(int[] numbers, int total, int index) {
        if (index == numbers.length) {
            return total;
        }
        total = total + numbers[index];
        index++;
        return input(numbers, total, index);

    }

    public static void main(String[] args) {

        int[] numbers = new int[]{10, 20, 30, 40, 50};
        System.out.println(input(numbers, 0, 0));
        System.out.println(Arrays.stream(numbers)
                                 .sum());
    }
}
