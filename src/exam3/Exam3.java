package exam3;

import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		for (int i = 1; i <= count; i++) {
			System.out.println("Case #"+i+": "+(scan.nextInt() + scan.nextInt()));
		}
		scan.close();
	}
}
