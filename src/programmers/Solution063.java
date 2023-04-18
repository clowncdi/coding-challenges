package programmers;

import java.util.Arrays;

/**
 * 로또의 최고 순위와 최저 순위
 */
public class Solution063 {
  public static void main(String[] args) {
    int[] lottos = {45, 4, 35, 20, 3, 9};
    int[] win_nums = {20, 9, 3, 45, 4, 35};
    int[] solution = solution(lottos, win_nums);
    System.out.println(Arrays.toString(solution));
  }

  public static int[] solution(int[] lottos, int[] win_nums) {
    int[] answer = new int[2];
    int zero = 0;
    for (int lotto : lottos) {
      zero += lotto == 0 ? 1 : 0;
      for (int j = 0; j < win_nums.length; j++) {
        answer[1] += lotto == win_nums[j] ? 1 : 0;
      }
    }
    answer[0] = getScore(answer[1] + zero);
    answer[1] = getScore(answer[1]);

    return answer;
  }

  private static int getScore(int num) {
    switch (num) {
      case 6:
        return 1;
      case 5:
        return 2;
      case 4:
        return 3;
      case 3:
        return 4;
      case 2:
        return 5;
      default:
        return 6;
    }
  }
}
