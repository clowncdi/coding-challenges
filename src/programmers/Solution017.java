package programmers;

/**
 * 정수 제곱근 판별
 */
public class Solution017 {
  public static void main(String[] args) {
    long n = 1;
    long answer = 0;
    if (n == 1) {
      answer = 4;
    }
    double num = Math.sqrt(n);
    if (num == (int) num && num > 3) {
      answer = (long) ((num + 1) * (num + 1));
    } else {
      answer = -1;
    }

    System.out.println(answer);
  }
}
