package baekjoon;

import java.util.Scanner;

/*
10539번 - 수빈이와 수열
 */
public class Main10539b {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int count = scan.nextInt();
    int[] temp = new int[count];
    int inc = 0;
    for (int i = 0; i < count; i++) {
      temp[i] = scan.nextInt() * (i+1);
      System.out.print(temp[i] - inc + " ");
      inc += temp[i] - inc;
    }
  }
}
