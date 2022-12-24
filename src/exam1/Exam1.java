package exam1;

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		if (s.length() <= 50) {
			System.out.println(s + "??!");
		}
	}
}
