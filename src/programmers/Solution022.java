package programmers;

/**
 * 콜라츠 추측
 */
public class Solution022 {
  public static void main(String[] args) {
    int num = 626331;
    int answer = 0;
    long result = num;
    while (result > 1) {
      if (answer > 500) {
        answer = -1;
        break;
      }
      result = result % 2 == 0 ? result / 2 : result * 3 + 1;
      answer++;
      System.out.println(result +" / "+answer);
    }

    System.out.println(answer);
  }
}
