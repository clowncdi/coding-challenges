package programmers;

/**
 * 없는 숫자 더하기
 */
public class Solution028 {
  public static void main(String[] args) {
    int[] numbers = {5,8,4,0,6,7,9};
    int answer = 45;

    for (int number : numbers) {
      answer -= number;
    }

    System.out.println(answer);
  }
}
