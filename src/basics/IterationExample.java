package core.java.basics;

public class IterationExample {

	public static void main(String[] args) {

		int countDownTimer = 10;
		
		while (countDownTimer!=0) {
			countDownTimer--;
			System.out.print(countDownTimer + " ");
		}
		
		System.out.println();
		
		int countDownTimer2 = 10;
		
		do {
			countDownTimer2++;
			System.out.print(countDownTimer2 + " ");
		} while (countDownTimer2 < 15);
		
		System.out.println();
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) continue;
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for (int i = 1; i < 10; i++) {
			if (i == 6) break;
			System.out.print(i + " ");
		}
	}
}
