package programmers;

import java.util.HashMap;
import java.util.Map;

/**
 * 완주하지 못한 선수
 */
public class Solution067 {
  public static void main(String[] args) {
    String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
    String[] completion = {"josipa", "filipa", "marina", "nikola"};
    String solution = solution(participant, completion);
    System.out.println(solution);
  }

  public static String solution(String[] participant, String[] completion) {
    String answer = "";
    Map<String, Integer> map = new HashMap<>();
    for (String s : completion) {
      map.put(s, map.getOrDefault(s, 0) + 1);
    }
    for (String s : participant) {
      if (map.get(s) == null || map.get(s) == 0) {
        answer = s;
      } else {
        map.put(s, map.get(s) - 1);
      }
    }
    return answer;
  }
}
