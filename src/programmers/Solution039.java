package programmers;

/**
 * 3진법 뒤집기
 */
public class Solution039 {
  public static void main(String[] args) {
    int n = 45;

    int num = Integer.parseInt(
        new StringBuilder(
        Integer.toString(n, 3)
        ).reverse().toString(), 3);

    System.out.println(num);
  }
}
