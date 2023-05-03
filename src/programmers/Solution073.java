package programmers;

import java.util.Arrays;

/**
 * 대충 만든 자판
 */
public class Solution073 {
  public static void main(String[] args) {
    // String[] keymap = {"ABACD", "BCEFD"};
    // String[] keymap = {"AA"};
    String[] keymap = {"AB"};
    // String[] targets = {"ABCD","AABB"};
    // String[] targets = {"B"};
    String[] targets = {"BC"};
    int[] solution = solution(keymap, targets);
    System.out.println(Arrays.toString(solution));
  }

  public static int[] solution(String[] keymap, String[] targets) {
    int[] answer = new int[targets.length];
    int index = -1;
    int count = 0;

    for (int i = 0; i < targets.length; i++) {
      for (char c : targets[i].toCharArray()) {
        int before = 100;
        for (String s : keymap) {
          if (s.indexOf(c) > -1 && before > s.indexOf(c)) {
            index = s.indexOf(c);
            before = index;
          }
        }
        if (index == -1) {
          count = 0;
          break;
        } else {
          count += index + 1;
          index = -1;
        }
      }
      answer[i] = count == 0 ? -1 : count;
      count = 0;
    }

    return answer;
  }

}
