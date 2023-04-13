package programmers;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 문자열 내림차순으로 배치하기
 */
public class Solution032 {
  public static void main(String[] args) {
    String s = "Zbcdefg";

    String[] arr = s.split("");
    ArrayList<String> lower = new ArrayList<>();
    ArrayList<String> upper = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == arr[i].toLowerCase()) {
        lower.add(arr[i]);
      } else {
        upper.add(arr[i]);
      }
    }
    lower.sort(Collections.reverseOrder());
    upper.sort(Collections.reverseOrder());
    lower.addAll(upper);

    System.out.println(String.join("", lower));
  }
}
