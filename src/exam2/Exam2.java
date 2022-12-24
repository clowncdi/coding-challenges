package exam2;

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int sum = 0;

		if (isEqual(num1, num2) && isEqual(num2, num3)) {
			sum = num1 * 1000 + 10000;
		} else if (isEqual(num1, num2) || isEqual(num1, num3)) {
			sum = num1 * 100 + 1000;
		} else if (isEqual(num2, num3)) {
			sum = num2 * 100 + 1000;
		} else {
			sum = Math.max(num1, Math.max(num2, num3)) * 100;
		}
		System.out.println(sum);
	}

	public static boolean isEqual(int num1, int num2) {
		return num1 == num2;
	}

}
