package programmers;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 달리기 경주
 * 일반 반복문을 이용하여 swap하면 느림.
 * map을 이용하는 게 더 빠름.
 */
public class Solution011 {
  public static void main(String[] args) {
    String[] players = {"mumu", "soe", "poe", "kai", "mine"};
    String[] callings = {"kai", "kai", "mine", "mine"};

    HashMap<String, Integer> map = new HashMap<>();
    for (int i = 0; i < players.length; i++) {
      map.put(players[i], i);
    }

    String front = "";
    for (String calling : callings) {
      int i = map.get(calling);
      front = players[i-1];
      players[i-1] = players[i];
      players[i] = front;
      map.put(front, i);
      map.put(calling, i-1);
    }

    System.out.println(Arrays.toString(players));
  }
}
