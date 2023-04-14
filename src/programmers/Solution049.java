package programmers;

/**
 * 콜라 문제
 */
public class Solution049 {
  public static void main(String[] args) {
    int a = 3;
    int b = 1;
    int n = 20;
    int answer = 0;

    int remain = 0;
    int temp = 0;
    while (n+remain >= a) {
      temp = (n + remain) / a * b;
      remain = (n + remain) % a;
      n = temp;
      answer += temp;
      System.out.printf("n= %d, remain= %d, sum= %d\n", n, remain, n+remain);
    }

    System.out.println(answer);
  }
}
