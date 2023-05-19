package exam;

import java.util.Scanner;

public class Exam4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		for (int i = 1; i <= count; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.printf("Case #%d: %d + %d = %d\n", i, a, b, a+b);
		}
		scan.close();
	}
}
