package programmers;

import java.util.regex.Pattern;

/**
 * 키패드 누르기
 */
public class Solution069 {
  public static void main(String[] args) {
    int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}; // LRLL RRLL LRR
    String hand = "right";
    String solution = solution(numbers, hand);
    System.out.println(solution);
  }

  public static String solution(int[] numbers, String hand) {
    StringBuilder sb = new StringBuilder();
    String defaultHand = hand.substring(0, 1).toUpperCase();
    int left = defaultHand == "L" ? 0 : -1;
    int right = defaultHand == "R" ? 0 : -1;
    for (int n : numbers) {
      String matchesLeft = String.format("%d|1|4|7", left);
      String matchesRight = String.format("%d|3|6|9", right);
      boolean leftMatch = Pattern.matches(matchesLeft, String.valueOf(n));
      boolean rightMatch = Pattern.matches(matchesRight, String.valueOf(n));

      if (leftMatch) {
        left = n;
        sb.append("L");
        continue;
      }
      if (rightMatch) {
        right = n;
        sb.append("R");
        continue;
      }

      String nextMatches = String.format("%d|%d|%d|%d", n-1,n+1,n-3,n+3);
      boolean nextLeft = Pattern.matches(nextMatches, String.valueOf(left));
      boolean nextRight = Pattern.matches(nextMatches, String.valueOf(right));

      if (nextLeft && nextRight) {
        if (defaultHand == "L") {
          left = n;
        } else {
          right = n;
        }
        sb.append(defaultHand);
        continue;
      }
      if (nextLeft) {
        left = n;
        sb.append("L");
        continue;
      }
      if (nextRight) {
        right = n;
        sb.append("R");
        continue;
      }

    }
    return sb.toString();
  }

}
