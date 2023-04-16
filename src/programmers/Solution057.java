package programmers;

import java.util.Arrays;

/**
 * 명예의 전당 (1)
 */
public class Solution057 {
  public static void main(String[] args) {
    int k = 3;
    int[] score = {10, 100, 20, 150, 1, 100, 200};

    int[] answer = new int[score.length];
    int[] temp = new int[k+1];
    int init = k;
    int count = score.length > k ? k : score.length;

    for (int i = 0; i < count; i++) {
      temp[0] = score[i];
      temp = Arrays.stream(temp).sorted().toArray();
      answer[i] = temp[init--];
    }

    for (int i = k; i < score.length; i++) {
      if (count >= score.length) break;
      temp[0] = score[i];
      temp = Arrays.stream(temp).sorted().toArray();
      answer[i] = temp[1];
    }

    // queue를 이용한 방법
//    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//    int temp = 0;
//    for(int i = 0; i < score.length; i++) {
//      priorityQueue.add(score[i]);
//      if (priorityQueue.size() > k) {
//        priorityQueue.poll();
//      }
//      answer[i] = priorityQueue.peek();
//    }

    System.out.println(Arrays.toString(answer));
  }
}
