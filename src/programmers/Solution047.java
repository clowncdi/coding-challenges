package programmers;

import java.util.Arrays;

/**
 * K번째수
 */
public class Solution047 {
  public static void main(String[] args) {
    int[] array = {1, 5, 2, 6, 3, 7, 4};
    int[][] commands = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};
    int[] answer = new int[commands.length];
    int index = 0;
    for (int[] command : commands) {
      int[] num = new int[command[1]-command[0]+1];
      int count = 0;
      for (int i = command[0]-1; i < command[1]; i++) {
        num[count++] = array[i];
      }
      Arrays.sort(num);
      answer[index++] = num[command[2]-1];
    }

    System.out.println(Arrays.toString(answer));
  }
}
