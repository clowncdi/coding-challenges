package programmers;

/**
 * 두 정수 사이의 합
 */
public class Solution021 {
  public static void main(String[] args) {
    int a = 3;
    int b = 5;
    long answer = 0;

    long min = Math.min(a, b);
    long max = Math.max(a, b);
//
//    for (int i = min; i <= max; i++) {
//      if (a == b) break;
//      answer += i;
//    }

    // 등차수열의 합 공식을 이용하면 반복문도 필요없음

    answer = (max - min + 1) * (min + max) / 2;



    System.out.println(answer);
  }
}
