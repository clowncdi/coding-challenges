package programmers;

/**
 * 문자열 다루기 기본
 */
public class Solution007 {
  public static void main(String[] args) {
    String s = "12321";
    boolean answer = s.matches("\\d{4}|\\d{6}");
    System.out.println(answer);
  }
}
