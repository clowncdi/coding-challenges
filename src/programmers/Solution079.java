package programmers;

import java.util.Arrays;

public class Solution079 {
  public static void main(String[] args) {
//    String[] park = {"SOO", "OOO", "OOO"};
//    String[] routes = {"E 2","S 2","W 1"};
//    String[] park = {"SOO", "OXX", "OOO"};
//    String[] routes = {"E 2", "S 2", "W 1"};
    String[] park = {"OSO","OOO","OXO","OOO"};
    String[] routes = {"E 2","S 3","W 1"};
    int[] solution = solution(park, routes);
    System.out.println(Arrays.toString(solution));
  }

  public static int[] solution(String[] park, String[] routes) {
    final String S = "S";
    int x = park[0].length() - 1;
    int y = park.length - 1;

    //시작점 찾기
    int[] start = new int[2];
    for (int i = 0; i < park.length; i++) {
      if (park[i].contains(S)) {
        start[0] = i;
        start[1] = park[i].indexOf(S);
      }
    }

    for (String route : routes) {
      int step = Integer.parseInt(route.split(" ")[1]);
      int key = 0;
      boolean operation = true;
      if ("WE".contains(route.split(" ")[0])) {
        key = 1;
      }
      if ("NW".contains(route.split(" ")[0])) {
        operation = false;
      }
      if (operation ? start[key] + step > x || start[key] + step > y : start[key] - step < 0) {
        continue;
      }
      start = move(park, start, step, key, operation);
    }

    return start;
  }

  private static int[] move(String[] park, int[] start, int step, int k, boolean op) {
    int[] newStart = start.clone();
    for (int i = 1; i <= step; i++) {
      if (k == 1) {
        if (park[start[0]].charAt(op ? start[1] + i : start[1] - i) == 'X') {
          return start;
        }
        newStart[1] = op ? newStart[1]+1 : newStart[1]-1;
      }
      if (k == 0) {
        if (park[op ? start[0] + i : start[0] - i].charAt(start[1]) == 'X') {
          return start;
        }
        newStart[0] = op ? newStart[0]+1 : newStart[0]-1;
      }
    }
    return newStart;
  }

}
