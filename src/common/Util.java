package core.java.common;

import java.util.Random;

public class Util {

    public static int[] populateArray(int size) {
        Random random = new Random();
        int[] array = random.ints(size, 1, 1000)
                            .toArray();
        return array;
    }

    public static void printSortedArray(int[] array) {
        for (int x : array) {
            System.out.print(x + " ");
        }
    }

    public static void swap(int[] array, int oldIndex, int newIndex) {
        int temp;
        temp = array[newIndex];
        array[newIndex] = array[oldIndex];
        array[oldIndex] = temp;
    }
}
