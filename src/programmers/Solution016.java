package programmers;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 자연수 뒤집어 배열로 만들기
 */
public class Solution016 {
  public static void main(String[] args) {
    long n = 9132513251L;

    int size = (int)(Math.log10(n) + 1); // String으로 변환해서 length()를 구해도 됨
    int[] answer = new int[size];

    for (int i = 0; i < size; i++) {
      if (n < 10) {
        answer[i] = (int) n;
        break;
      }
      answer[i] = (int) (n % 10);
      n = n / 10;
    }

    System.out.println(Arrays.toString(answer));
  }
}
