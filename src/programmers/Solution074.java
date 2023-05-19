package programmers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 햄버거 만들기
 */
public class Solution074 {

  public static void main(String[] args) {
//    int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1, 2, 1, 1, 2, 3, 1, 2, 3, 1};
//    int[] ingredient = {1, 3, 2, 1, 2, 1, 3, 1, 2, 1, 3, 2, 1, 2, 1, 3, 1, 2};
//    int[] ingredient = {1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1};
//    int[] ingredient = {1};
    int[] ingredient = {1, 1, 2, 1, 2, 3, 1, 3, 1, 2, 3, 1};
//    int[] ingredient = {1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1};
//    int[] ingredient = {1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 1, 1, 2, 3, 3, 1, 2, 3, 1, 3, 3, 3, 2, 1, 2, 3, 1};
//    int[] ingredient = {1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 1, 1, 2, 3, 3, 1};
//    int[] ingredient = {1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 2, 3, 1, 2, 3, 1};
//    int[] ingredient = {1, 2, 1, 2, 3, 1, 3, 1, 2, 3, 1, 2, 3, 1};
//    int[] ingredient = {1, 2, 2, 3, 1};
    int solution = solution2(ingredient);
    System.out.println("solution = " + solution);
  }

  // 새로운 int 배열에 4개씩 담아서 1, 3, 2, 1이면 4개를 제거하고 answer를 1 증가시킨다.
  public static int solution2(int[] ingredient) {
    int answer = 0;
    int count = 0;
    int[] arr = new int[ingredient.length];
    for (int i : ingredient) {
      arr[count++] = i;
      if (count >= 4 &&
          arr[count - 1] == 1 &&
          arr[count - 2] == 3 &&
          arr[count - 3] == 2 &&
          arr[count - 4] == 1) {
        count -= 4;
        answer++;
      }
    }

    return answer;
  }

  // 불필요한 반복과 요소들때문에 느림.
  public static int solution1(int[] ingredient) {
    int answer = 0;

    List<Integer> arr = Arrays.stream(ingredient).boxed().collect(Collectors.toList());

    for (int i = 0; i < arr.size() - 3; i++) {
      if (arr.get(i) != 1) {
        continue;
      }
      if (arr.get(i+1) != 2) {
        continue;
      }
      if (arr.get(i+2) != 3) {
        continue;
      }
      if (arr.get(i+3) != 1) {
        continue;
      }
      arr.remove(i);
      arr.remove(i);
      arr.remove(i);
      arr.remove(i);
      answer++;
      i = i-4 < 0 ? -1 : i-4;
    }

    return answer;
  }
}
