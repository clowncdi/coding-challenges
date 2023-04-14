package programmers;

import java.util.HashSet;

/**
 * 폰켓몬
 */
public class Solution053 {
  public static void main(String[] args) {
    int[] nums = {3, 1, 2, 3};

    HashSet<Integer> ints = new HashSet<>();
    for (int num : nums) {
      ints.add(num);
    }
    int half = nums.length / 2;

    System.out.println(ints.size() > half ? half : ints.size());
  }
}
