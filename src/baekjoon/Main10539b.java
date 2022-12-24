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
    for (int i = 0; i < count; i++) {
      temp[i] = scan.nextInt() * (i+1);
    }
    System.out.print(temp[0]);
    for (int i = 1; i < count; i++) {
      System.out.print(" " + (temp[i] - temp[i-1]));
    }
  }
}
