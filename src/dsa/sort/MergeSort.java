package core.java.dsa.sort;

import core.java.common.Util;

public class MergeSort {

    public static void main(String[] args) {

        int[] array = Util.populateArray(20);
        mergeSort(array);
        Util.printSortedArray(array);
    }

    private static void mergeSort(int[] array) {

        int length = array.length;
        if (length <= 1) {
            return;
        }
        int mid = length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[length - mid];
        int leftIndex = 0;
        int rightIndex = 0;

//      Input array is split into left and right array
        for (int i = 0; i < length; i++) {
            if (i < mid) {
                leftArray[leftIndex] = array[i];
                leftIndex++;
            } else {
                rightArray[rightIndex] = array[i];
                rightIndex++;
            }
        }

//      Recursive calls to split array into left and right array
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(array, leftArray, rightArray);
    }

    private static void merge(int[] array, int[] leftArray, int[] rightArray) {

        int sizeOfLeftArray = array.length / 2;
        int sizeOfRightArray = array.length - sizeOfLeftArray;

        int i = 0, leftIndex = 0, rightIndex = 0;

//      Comparing elements from left array to right array
        while (leftIndex < sizeOfLeftArray && rightIndex < sizeOfRightArray) {
            if (leftArray[leftIndex] <= rightArray[rightIndex]) {
                array[i] = leftArray[leftIndex];
                i++;
                leftIndex++;
            } else {
                array[i] = rightArray[rightIndex];
                i++;
                rightIndex++;
            }
        }

//      Populating input array with remaining values from left & right array
        while(leftIndex <  sizeOfLeftArray){
            array[i] = leftArray[leftIndex];
            i++;
            leftIndex++;
        }

        while(rightIndex <  sizeOfRightArray){
            array[i] = rightArray[rightIndex];
            i++;
            rightIndex++;
        }
    }
}
