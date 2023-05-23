package programmers;

import java.util.HashMap;
import java.util.Map;

public class Solution075 {
  public static void main(String[] args) {
//    String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
//    int[] choices = {5, 3, 2, 7, 5}; // TCMA
    String[] survey = {"TR", "RT", "TR"};
    int[] choices = {7, 1, 3};  // RCJA
    String solution = solution(survey, choices);
    System.out.println(solution);
  }

  public static String solution(String[] survey, int[] choices) {
    String mbti = "RTCFJMAN";
    Map<Character, Integer> map = new HashMap<>();
    for (char c : mbti.toCharArray()) {
      map.put(c, 0);
    }

    for (int i = 0; i < choices.length; i++) {
      int num = choices[i] - 4;
      Character choice = num <= 0 ? survey[i].charAt(0) : survey[i].charAt(1);
      map.put(choice, map.get(choice) + Math.abs(num));
    }

    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < mbti.length(); i+=2) {
      builder.append(
          map.get(mbti.charAt(i)) >= map.get(mbti.charAt(i+1)) ?
          mbti.charAt(i) : mbti.charAt(i+1));
    }

    return builder.toString();
  }
}
