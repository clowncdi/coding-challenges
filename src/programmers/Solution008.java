package programmers;

import java.util.Arrays;

/**
 * 체육복
 */
public class Solution008 {
  public static void main(String[] args) {
    int n = 10;
    int[] lost = {4, 1, 6};
    int[] reserve = {2, 3, 1, 8};
    Arrays.sort(lost);
    Arrays.sort(reserve);
    lost = Arrays.stream(lost)
        .filter(l -> !isSame(reserve, l))
        .toArray();
    lost = Arrays.stream(lost)
        .filter(l -> !isAlter(reserve, l))
        .toArray();
    System.out.println(n-lost.length);
  }

  private static boolean isSame(int[] reserve, int lostNum) {
    return isMatch(reserve, lostNum);
  }

  private static boolean isAlter(int[] reserve, int lostNum) {
    return isMatch(reserve, lostNum-1) || isMatch(reserve, lostNum+1);
  }

  private static boolean isMatch(int[] reserve, int lostNum) {
    for (int i = 0; i < reserve.length; i++) {
      if (reserve[i] > 0 && reserve[i] == lostNum) {
        reserve[i] = -1;
        return true;
      }
    }
    return false;
  }
}
