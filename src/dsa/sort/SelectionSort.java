package core.java.dsa.sort;

import core.java.common.Util;

public class SelectionSort {
    public static void main(String[] args) {

        int[] array = Util.populateArray(20);
        selectionSort(array);
        Util.printSortedArray(array);
    }

    private static void selectionSort(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largestIndex = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (array[i] > array[largestIndex]) {
                    largestIndex = i;
                }
                Util.swap(array, largestIndex, lastUnsortedIndex);
            }
        }
    }


}
