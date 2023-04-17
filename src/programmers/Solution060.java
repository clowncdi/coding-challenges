package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 실패율
 *
 * map 역정렬
 */
public class Solution060 {
  public static void main(String[] args) {
    int N = 10;
    int[] stages = {3,5,5,3,3};

    int totalCount = stages.length;
    Map<Integer, Double> stageFailRate = new HashMap<>();
    for (int i = 1; i <= N; i++) {
      stageFailRate.put(i, 0.0);
    }

    for (int stage : stages) {
      if (stage > N) continue;
      stageFailRate.put(stage, stageFailRate.getOrDefault(stage, 0.0) + 1.0);
    }

    for (Integer key : stageFailRate.keySet()) {
      Double count = stageFailRate.get(key);
      stageFailRate.put(key, count == 0.0 ? 0.0 : count / (double) totalCount);
      totalCount -= count;
    }

    ArrayList<Integer> keySet = new ArrayList<>(stageFailRate.keySet());
    keySet.sort((o1, o2) -> stageFailRate.get(o2).compareTo(stageFailRate.get(o1)));

    int[] array = keySet.stream().mapToInt(i -> i).toArray();
    System.out.println(Arrays.toString(array));
  }
}
