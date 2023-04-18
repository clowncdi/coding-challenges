package programmers;

/**
 * 덧칠하기
 */
public class Solution064 {
  public static void main(String[] args) {
    int n = 8;
    int m = 4;
    int[] section = {2, 3, 6};
    int solution = solution(n,m,section);
    System.out.println(solution);
  }

  public static int solution(int n, int m, int[] section) {
    int count = 1;
    int num = section[0] + m - 1;
    for (int i = 1; i < section.length; i++) {
      if (num < section[i]) {
        num = section[i] + m - 1;
        count++;
      }
    }
    return count;
  }
}
