package programmers;

import java.util.Arrays;

/**
 * k진수에서 소수 개수 구하기
 */
public class Solution010 {
  public static void main(String[] args) {
    int n = 110011;
    int k = 10;
    int answer = 0;

    String source = Integer.toString(n, k);
    System.out.println(source);

    String[] result = source.split("0");
    System.out.println(Arrays.toString(result));
    for (String s : result) {
      if (s.isEmpty()) {
        continue;
      }
      long num = Long.parseLong(s);
      if (isPrime(num)) {
        answer++;
      }
    }

    System.out.println(answer);
  }

  private static boolean isPrime(long num) {
    if (num < 2) {
      return false;
    }

    for (int i = 2; i <= (int) Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}
