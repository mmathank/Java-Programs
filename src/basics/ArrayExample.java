package core.java.basics;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {

		int[] arrOfNum = new int[3] ;
		arrOfNum[0] = 30;
		arrOfNum[1] = 10;
		arrOfNum[2] = 20;
//		arrOfNum[3] = 40;
		System.out.println(arrOfNum.length);
		System.out.println("0th Element: " + arrOfNum[0]);
		System.out.println("1st Element: " + arrOfNum[1]);
		System.out.println("2nd Element: " + arrOfNum[2]);
		
//		Printing array using for loop
		for (int i = 0; i < arrOfNum.length; i++) {
			System.out.print(arrOfNum[i] + " ");
		}

		int[] arrOfNum2;
		arrOfNum2 = new int[] { 60, 50, 40 };
		
//		Printing array using For-Each loop
		System.out.println();
		for (int i : arrOfNum2)
			System.out.print(i + " ");

		int[] arrOfNum3 = { 70, 80, 90 };
		System.out.println();
		System.out.println(Arrays.toString(arrOfNum3));

		int[] numbers = { 10, 25, 5, 32, 14, 7 };
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));

//		Two-Dimensional Array
		int[][] twoDimArr = { { 1, 2, 3, 4, 5, 6 }, { 1, 1, 1, 1, 1, 1 }, { 0, 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5, 6 },
				{ 1, 1, 1, 1, 1, 1 }, { 5, 4, 3, 2, 1, 0 } };

		for (int[] arr : twoDimArr) {
			System.out.println();
			for (int num : arr) {
				System.out.print(num + " ");
			}
			System.out.println();
		}

		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		for (int i = 0; i < twoDimArr.length; i++) {
			System.out.println();
			for (int j = 0; j < twoDimArr[i].length; j++) {
				System.out.print(twoDimArr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
	}

}
