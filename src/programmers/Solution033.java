

package programmers;

/**
 * 약수의 개수와 덧셈
 */
public class Solution033 {
  public static void main(String[] args) {
    int left = 13;
    int right = 17;
    int answer = 0;

    // int count = 0;
    // for (int i = left; i <= right; i++) {
    //   for (int j = 1; j <= i; j++) {
    //     if (i % j == 0) {
    //       count++;
    //     }
    //   }
    //   answer += i * (count % 2 == 0 ? 1 : -1);
    //   count = 0;
    // }

    // 제곱수인 경우 약수의 개수가 홀수인 것을 이용한 방법
    for (int i = left; i <= right; i++) {
      if (i % Math.sqrt(i) == 0) {
        answer -= i;
      } else {
        answer += i;
      }
    }

    System.out.println(answer);

  }
}
