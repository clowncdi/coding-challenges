package baekjoon;

import java.util.Scanner;

public class Main17389 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int count = scan.nextInt();
    String ox = scan.next();
    int sum = 0, bonus = 0;

    for (int i = 0; i < count; i++) {
      if (ox.charAt(i) == 79) {
        sum += i+1;
        if (i > 0 && ox.charAt(i) == ox.charAt(i - 1)) {
          bonus++;
          sum += bonus;
        } else {
          bonus = 0;
        }
      } else {
        bonus = 0;
      }
    }

    System.out.println(sum);
  }
}
