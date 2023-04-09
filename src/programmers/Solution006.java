package programmers;

/**
 * 피보나치 수
 * 2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴하는 함수, solution을 완성해 주세요.
 */
public class Solution006 {
  public static void main(String[] args) {
    int n = 100000;
    int answer = 0;
    answer = f(n);
    System.out.println(answer);
  }

  private static int f(int n) {
    int a = 1;
    int b = 1;
    int result = 0;

    for (int i = 1; i < n; i++) {
      if (i == 1 || i == 2) {
        result = a + b;
        continue;
      }
      a = b;
      b = result;
      result = (a + b) % 1234567;
    }

    return result;
  }
}
