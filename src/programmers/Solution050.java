package programmers;

import java.util.stream.IntStream;

/**
 * 푸드 파이트 대회
 */
public class Solution050 {
  public static void main(String[] args) {
    int[] food = {1, 3, 4, 6};
    StringBuilder answer = new StringBuilder();

    int count = 0;
    for (int i = 1; i < food.length; i++) {
      count = food[i] / 2;
      int finalI = i;
      IntStream.range(1, count+1).forEach(j -> answer.append(finalI));
    }
    String a = answer.toString() + "0";
    a += answer.reverse().toString();

    System.out.println(a);

  }
}
