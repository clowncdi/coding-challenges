package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution077 {
  public static void main(String[] args) {
//    String[] wallpaper = {".#...", "..#..", "...#."}; // result [0, 1, 3, 4]
    String[] wallpaper = {"..........", ".....#....", "......##..", "...##.....", "....#....."}; //1, 3, 5, 8
    int[] solution = solution(wallpaper);
    System.out.println(Arrays.toString(solution));
  }

  public static int[] solution(String[] wallpaper) {
    int[] answer = new int[4];

    // 리스트에 # 앞뒤 위치 담기
    List<int[]> list = new ArrayList<>();
    for (int i = 0; i < wallpaper.length; i++) {
      int idx1 = wallpaper[i].indexOf("#");
      int idx2 = wallpaper[i].lastIndexOf("#");
      list.add(new int[]{idx1, idx2});
    }

    // 좌측 세로 시작점 구하기
    int[] minIndex = list.stream().filter(arr -> arr[0] > -1).findFirst().get();
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) == minIndex) {
        answer[0] = i;
      }
    }
    // 좌측 가로 시작점 구하기
    int[] min = list.stream().filter(arr -> arr[0] > -1).min(Comparator.comparing(x -> x[0])).get();
    answer[1] = min[0];

    // 우측 세로 시작점 구하기
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i)[1] > -1) {
        answer[2] = i + 1;
      }
    }
    // 우측 가로 시작점 구하기
    int[] max = list.stream().max(Comparator.comparing(x->x[1])).get();
    answer[3] = max[1] + 1;

    return answer;
  }
}
