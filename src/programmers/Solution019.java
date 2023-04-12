package programmers;

import java.util.Arrays;
import java.util.Collections;

/**
 * 정수 내림차순으로 배치하기
 */
public class Solution019 {
  public static void main(String[] args) {
    long n = 123456789012345L;
    long answer = 0;
    String temp = n + "";
    Integer[] result = new Integer[temp.length()];
    for (int i = 0; i < temp.length(); i++) {
      if (n < 10) {
        result[i] = (int) n;
      }
      result[i] = (int) (n % 10);
      System.out.println(n % 10);
      n = n / 10;
      System.out.println(Arrays.toString(result));
    }

    Arrays.sort(result, Collections.reverseOrder());
    StringBuilder temp2 = new StringBuilder();
    for (Integer integer : result) {
      temp2.append(integer);
    }
    System.out.println(temp2);
    answer = Long.parseLong(String.valueOf(temp2));

    System.out.println(answer);
  }
}
