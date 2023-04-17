package programmers;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 과일 장수
 *
 * int 배열 정렬
 */
public class Solution059 {
  public static void main(String[] args) {
    int k = 4;
    int m = 3;
    int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};

    int answer = 0;
    int boxCount = score.length / m;

    Integer[] sorted = Arrays.stream(score)
        .boxed()
        .sorted(Comparator.reverseOrder())
        .toArray(Integer[]::new);

    for (int i = 1; i <= boxCount; i++) {
      answer += sorted[i * m - 1] * m;
    }

    System.out.println(answer);
  }
}
