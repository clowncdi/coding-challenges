package programmers;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * 제일 작은 수 제거하기
 */
public class Solution027 {
  public static void main(String[] args) {
    int[] arr = {10};
    int[] answer = {-1};

    if (arr.length > 2) {
      int min = Arrays.stream(arr).min().getAsInt();
      answer = Arrays.stream(arr).filter(i -> i != min).toArray();
    }

    System.out.println(Arrays.toString(answer));
  }
}
