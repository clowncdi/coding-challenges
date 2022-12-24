package exam3;

import java.util.Scanner;

public class Exam6 {
	public static void main(String[] args) {
		int count = new Scanner(System.in).nextInt();
		StringBuilder star = new StringBuilder("");
		for (int i = 1; i <= count; i++) {
			star.append("*");
			System.out.printf("%"+count+"s\n",star);
		}
	}
}
