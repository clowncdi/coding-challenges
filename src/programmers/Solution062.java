package programmers;

import java.util.Stack;

/**
 * 카드 뭉치
 */
public class Solution062 {
  public static void main(String[] args) {
    String[] cards1 = {"i", "drink", "water"};
    String[] cards2 = {"want", "to"};
    String[] goal = {"i", "want", "to", "drink", "water"};
    String solution = solution(cards1, cards2, goal);
    System.out.println(solution);
  }

  public static String solution(String[] cards1, String[] cards2, String[] goal) {
    Stack<String> card1 = new Stack<>();
    Stack<String> card2 = new Stack<>();
    for (int i = cards1.length-1; i >= 0; i--) {
      card1.push(cards1[i]);
    }
    for (int i = cards2.length-1; i >= 0; i--) {
      card2.push(cards2[i]);
    }
    int count = 0;
    for (int i = 0; i < goal.length; i++) {
      if (card1.size() != 0 && goal[i].equals(card1.peek())) {
        card1.pop();
        count++;
      }
      if (card2.size() != 0 && goal[i].equals(card2.peek())) {
        card2.pop();
        count++;
      }
    }
    return goal.length == count ? "Yes" : "No";
  }
}
