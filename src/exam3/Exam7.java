package exam3;

import java.util.Scanner;

public class Exam7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			if (num1 == 0 && num2 == 0) {
				break;
			}
			System.out.println(num1 + num2);
		}
		scan.close();
	}
}
