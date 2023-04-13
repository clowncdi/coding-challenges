package programmers;

import java.util.Arrays;

/**
 * 행렬의 덧셈
 */
public class Solution035 {
  public static void main(String[] args) {
    int[][] arr1 = {{1, 2},{2, 3}};
    int[][] arr2 = {{3, 4},{5, 6}};
    int[][] answer = arr1;

    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr1[i].length; j++) {
        answer[i][j] += arr2[i][j];
      }
    }

    System.out.println(Arrays.deepToString(answer));

  }
}
