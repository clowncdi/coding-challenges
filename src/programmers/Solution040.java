package programmers;

import java.util.Arrays;

/**
 * 예산
 */
public class Solution040 {
  public static void main(String[] args) {
    int[] d = {2,2,3,3};
    int budget = 10;
    int answer = 0;

    Arrays.sort(d);
    for (int i : d) {
      if (budget - i < 0) {
        break;
      }
      budget -= i;
      answer++;
    }

    System.out.println(answer);
  }
}
