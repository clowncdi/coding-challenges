package programmers;

/**
 * 문자열 나누기
 */
public class Solution070 {
  public static void main(String[] args) {
    String s = "aaabbaccccabba";
    int solution = solution(s);
    System.out.println(solution);
  }

  public static int solution(String s) {
    int answer = 1;
    String first = s.substring(0, 1);
    int firstCount = 1;
    int secondCount = 0;

    for (int i = 1; i < s.length(); i++) {
      String next = s.substring(i, i + 1);

      if (firstCount == secondCount) {
        // System.out.printf("%s %s | f %d, s %d | 성공: %d\n", first, next, firstCount, secondCount, answer);
        answer++;
        firstCount = 1;
        secondCount = 0;
        first = next;
        continue;
      }

      if (first.equals(next)) {
        firstCount++;
      } else {
        secondCount++;
      }

    }

    return answer;
  }

}
