package programmers;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 추억 점수
 */
public class Solution058 {
  public static void main(String[] args) {
    String[] name = {"kali", "mari", "don"};
    int[] yearning = {11, 1, 55};
    String[][] photo = {{"kali", "mari", "don"},{"pony", "tom", "teddy"},{"con", "mona", "don"}};

    HashMap<String, Integer> names = new HashMap();
    for (int i = 0; i < name.length; i++) {
      names.put(name[i], yearning[i]);
    }

    int[] array = Arrays.stream(photo).map(p -> {
      int sum = 0;
      for (int i = 0; i < p.length; i++) {
        if (names.containsKey(p[i])) {
          sum += names.get(p[i]);
        }
      }
      return sum;
    }).mapToInt(Integer::intValue).toArray();

    System.out.println(Arrays.toString(array));
  }
}
