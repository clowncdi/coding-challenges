package programmers;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 같은 숫자는 싫어
 */
public class Solution038 {
  public static void main(String[] args) {
    int[] arr = {1,1,3,3,0,1,1};
    int[] answer = {};

    ArrayList<Integer> list = new ArrayList<>();
    list.add(arr[0]);
    for (int i = 1; i < arr.length; i++) {
      if (arr[i-1] == arr[i]) {
        continue;
      } else {
        list.add(arr[i]);
      }
    }

    answer = list.stream().mapToInt(i -> i).toArray();

    System.out.println(Arrays.toString(answer));


  }
}
