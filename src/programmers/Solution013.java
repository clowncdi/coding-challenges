package programmers;

import java.util.Arrays;

/**
 * x만큼 간격이 있는 n개의 숫자
 */
public class Solution013 {
  public static void main(String[] args) {
    int x = -4;
    int n = 2;
    long[] answer = new long[n];
    answer[0] = x;
    for (int i = 1; i < n; i++) {
      answer[i] = answer[i-1] + x;
    }

    System.out.println(Arrays.toString(answer));
  }
}
