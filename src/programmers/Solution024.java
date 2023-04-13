package programmers;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 나누어 떨어지는 숫자 배열
 */
public class Solution024 {
  public static void main(String[] args) {
    int[] arr = {5, 9, 7, 10};
    int divisor = 5;
    int[] answer = {};
    // ArrayList<Integer> list = new ArrayList<>();
    // for (int j : arr) {
    //   if (j % divisor == 0) {
    //     list.add(j);
    //   }
    // }
    int[] list = Arrays.stream(arr).filter(i -> i % divisor == 0).sorted().toArray();
    answer = list.length == 0 ? new int[] {-1} : list;

    System.out.println(Arrays.toString(answer));
  }
}
