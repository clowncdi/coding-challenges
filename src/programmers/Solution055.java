package programmers;

/**
 * 소수 찾기
 */
public class Solution055 {
  public static void main(String[] args) {
    int n = 123;
    int answer = 0;

    for (int i = 2; i <= n; i++) {
      answer += isPrime(i) ? 1 : 0;
    }

    System.out.println(answer);
  }

  private static boolean isPrime(int n) {
    if (n < 2) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
