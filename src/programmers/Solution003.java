package programmers;

import java.util.HashMap;
import java.util.Map;

/**
 * 겹치는 선분의 길이
 * 선분 3개가 평행하게 놓여 있습니다. 세 선분의 시작과 끝 좌표가 [[start, end], [start, end], [start, end]] 형태로 들어있는 2차원 배열 lines가 매개변수로 주어질 때, 두 개 이상의 선분이 겹치는 부분의 길이를 return 하도록 solution 함수를 완성해보세요.
 * lines가 [[0, 2], [-3, -1], [-2, 1]]일 때 그림으로 나타내면 다음과 같습니다.
 * 선분이 두 개 이상 겹친 곳은 [-2, -1], [0, 1]로 길이 2만큼 겹쳐있습니다.
 */
public class Solution003 {
  public static void main(String[] args) {
    int[][] lines = {{0, 2}, {-3, -1}, {-2, 1}};
//    int[][] lines = {{0, 5}, {3, 9}, {1, 10}};
    int answer = 0;

    Map<String, Integer> map = new HashMap<>();

    for (int[] line : lines) {
      int tempMin = Math.min(line[0], line[1]);
      int tempMax = Math.max(line[0], line[1]);
      for (int i = tempMin; i < tempMax; i++) {
        String str = i + "|" + (i + 1);
        map.put(str, map.getOrDefault(str, 0) + 1);
      }
    }

    for (Integer value : map.values()) {
      if (value > 1) answer++;
    }

    System.out.println(answer);
  }
}
