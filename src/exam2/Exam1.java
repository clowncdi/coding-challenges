package exam2;

import java.util.Scanner;

class Exam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hour = scan.nextInt();
		int minute = scan.nextInt() + scan.nextInt();

		hour = (hour + minute / 60) % 24;
		minute = minute % 60;

		System.out.println(hour + " " + minute);
	}
}
