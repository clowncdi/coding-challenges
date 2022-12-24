package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main15969b {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int count = scan.nextInt();
    int[] temp = new int[count];
    for (int i = 0; i < count; i++) {
      temp[i] = scan.nextInt();
    }
    Arrays.sort(temp);
    System.out.println(temp[count-1] - temp[0]);
  }
}
