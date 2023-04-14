package programmers;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 가장 가까운 같은 글자
 */
public class Solution051 {
  public static void main(String[] args) {
    String s = "banana";
    int[] answer = new int[s.length()];

    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      answer[i] = s.indexOf(c) == i ? -1 : s.indexOf(c, i) - map.get(c);
      map.put(c, i);
    }

    System.out.println(Arrays.toString(answer));
  }
}
