package programmers;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 자릿수 더하기
 */
public class Solution012 {
  public static void main(String[] args) {
    int n = 123;
    int answer = 0;

    while (n > 0) {
      answer += n % 10;
      n /= 10;
    }

    System.out.println(answer);
  }
}
