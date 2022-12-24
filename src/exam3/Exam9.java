package exam3;

import java.util.Scanner;

public class Exam9 {
	public static void main(String[] args) {
		int num = new Scanner(System.in).nextInt();
		int sum = num, count = 0;
		while (sum != num || count == 0) {
			sum = ((sum % 10) * 10) + ((sum/10 + sum%10)%10);
			count++;
		}
		System.out.println(count);
	}
}
