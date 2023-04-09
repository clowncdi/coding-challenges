package programmers;

/**
 * 약수의 합
 */
public class Solution005 {
  public static void main(String[] args) {
    int n = 12;
    int answer = 0;

    for (int i = 1; i <= n/2; i++) {
      answer += n % i == 0 ? i : 0;
    }

    System.out.println(answer+n);
  }
}
