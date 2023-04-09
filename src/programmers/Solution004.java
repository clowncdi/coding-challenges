package programmers;

import java.util.Arrays;

/**
 * 평균 구하기
 */
public class Solution004 {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4};
    double answer = 0;

    answer = Arrays.stream(arr).average().orElse(0);

    System.out.println(answer);
  }
}
