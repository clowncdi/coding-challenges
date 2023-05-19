package exam;

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total = scan.nextInt();
		int count = scan.nextInt();
		for (int i = 0; i < count; i++) {
			int item = scan.nextInt();
			int itemCount = scan.nextInt();
			total -= item * itemCount;
		}
		System.out.println(total == 0 ? "Yes" : "No");
	}
}
