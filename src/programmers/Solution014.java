package programmers;

import java.util.Arrays;

/**
 * 나머지가 1이 되는 수 찾기
 */
public class Solution014 {
  public static void main(String[] args) {
    int n = 12;
    int answer = 0;

    for (int i = 2; i < n; i++) {
      if (n % i == 1) {
        answer = i;
        break;
      }
    }

    System.out.println(answer);
  }
}
