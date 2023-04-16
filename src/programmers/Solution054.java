package programmers;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 모의고사
 */
public class Solution054 {
  public static void main(String[] args) {
    int[] answers = {2,3,1,1,4,5,1,2,4,5,2,3,4,1};
    int[] aAnswer = {1,2,3,4,5};
    int[] bAnswer = {2,1,2,3,2,4,2,5};
    int[] cAnswer = {3,3,1,1,2,2,4,4,5,5};

    int[] answer = new int[3];
    for (int i = 0; i < answers.length; i++) {
      answer[0] += answers[i] == aAnswer[i % 5] ? 1: 0;
      answer[1] += answers[i] == bAnswer[i % 8] ? 1: 0;
      answer[2] += answers[i] == cAnswer[i % 10] ? 1: 0;
    }

    int max = Math.max(answer[0], Math.max(answer[1], answer[2]));
    int[] array = IntStream.range(1, 4).filter(i -> answer[i-1] == max).toArray();

    System.out.println(Arrays.toString(array));
  }
}
