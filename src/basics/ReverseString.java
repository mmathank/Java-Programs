package core.java.basics;
// Java program to Reverse a String using swapping
// of variables

// Class of ReverseString
class ReverseString {
    public static void main(String[] args) {
        String input = "J-ava-Programming-";
        char[] inputArray = input.toCharArray();
        int left, right = 0;
        right = inputArray.length - 1;

        for (left = 0; left < right; left++, right--) {
            // Swap values of left and right
            char temp = inputArray[left];
            inputArray[left] = inputArray[right];
            inputArray[right] = temp;
        }

        for (char c : inputArray) {
            System.out.print(c);
        }
        System.out.println();

        String input2 = "a-bc-def-ghij";
        char[] inputArray2 = input2.toCharArray();

        int leftIndex = 0;
        int rightIndex = inputArray2.length - 1;

        while (leftIndex < rightIndex) {

            if (inputArray2[leftIndex] == '-'){
                leftIndex++;
            }

            else if (inputArray2[rightIndex] == '-'){
                rightIndex--;
            }

            else {
                char temp = inputArray2[leftIndex];
                inputArray2[leftIndex] = inputArray2[rightIndex];
                inputArray2[rightIndex] = temp;
                leftIndex++;
                rightIndex--;
            }
        }
        for (char c : inputArray2) {
            System.out.print(c);
        }
    }
}