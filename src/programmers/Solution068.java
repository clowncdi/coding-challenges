package programmers;

/**
 * 옹알이 (2)
 */
public class Solution068 {
  public static void main(String[] args) {
    String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
    int solution = solution(babbling);
    System.out.println(solution);
  }

  public static int solution(String[] babbling) {
    int answer = 0;
    for (String src : babbling) {
      src = src.replaceAll("ayaaya|yeye|woowoo|mama", " ");
      src = src.replaceAll("aya|ye|woo|ma", "");
      answer += "".equals(src) ? 1 : 0;
    }
    return answer;
  }
}
