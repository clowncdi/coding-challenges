package programmers;

/**
 * 기사단원의 무기
 */
public class Solution065 {
  public static void main(String[] args) {
    int number = 20;
    int limit = 2;
    int power = 1;
    int solution = solution(number, limit, power);
    System.out.println(solution);
  }

  public static int solution(int number, int limit, int power) {
    int answer = 0;

    for (int i = 1; i <= number; i++) {
      int count = getCount(i);
      answer += count > limit ? power : count;
    }

    return answer;
  }
  
  private static int getCount(int num) {
    int count = 0;
    for (int i = 1; i * i <= num; i++) {
      if (i * i == num) {
        count++;
      } else if (num % i == 0) {
        count += 2;
      }
    }
    return count;
  }
}
