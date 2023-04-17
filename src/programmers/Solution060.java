package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * 실패율
 *
 * map 정렬
 */
public class Solution060 {
  public static void main(String[] args) {
    int N = 4;
    int[] stages = {4,4,4,4,4};

    int totalCount = stages.length;
    HashMap<Integer, Double> map = new HashMap<>();
    for (int i = 1; i <= N; i++) {
      map.put(i, 0.0);
    }

    for (int i = 0; i < stages.length; i++) {
      if (stages[i] > N) {
        continue;
      }
      map.put(stages[i], map.get(stages[i]) + 1);
    }

    for (Integer i : map.keySet()) {
      Double minus = map.get(i);
      map.put(i, map.get(i) / totalCount);
      totalCount -= minus;
    }

    ArrayList<Integer> keySet = new ArrayList<>(map.keySet());
    keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

    int[] array = keySet.stream().mapToInt(i -> i).toArray();
    System.out.println(Arrays.toString(array));
  }
}
