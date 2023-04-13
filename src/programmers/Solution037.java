package programmers;

import java.util.Arrays;

/**
 * 최대공약수와 최소공배수
 */
public class Solution037 {
  public static void main(String[] args) {
    int n = 2;
    int m = 5;
    int[] answer = new int[2];


    for (int i = 1; i <= Math.min(n, m); i++) {
      if (n % i == 0 && m % i == 0) {
        answer[0] = i;
        answer[1] = i * (n/i) * (m/i);
      }
    }

    System.out.println(Arrays.toString(answer));
  }
}
