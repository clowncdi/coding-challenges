package programmers;

/**
 * 가운데 글자 가져오기
 */
public class Solution029 {
  public static void main(String[] args) {
    String s = "abcd";
    String answer = "";

    boolean bool = s.length() % 2 == 0;
    int i = s.length() / 2;
    answer = s.substring(bool ? i-1 : i, i+1);

    System.out.println(answer);
  }
}
