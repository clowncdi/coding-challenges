package programmers;

/**
 * 이상한 문자 만들기
 */
public class Solution009 {
  public static void main(String[] args) {
    String s = "try hello world";
    String[] split = s.split(" ", -1);
    for (int i = 0; i < split.length; i++) {
      StringBuilder sb = new StringBuilder(split[i]);
      for (int j = 0; j < sb.length(); j++) {
        if (j % 2 == 0) {
          sb.setCharAt(j, Character.toUpperCase(sb.charAt(j)));
        } else {
          sb.setCharAt(j, Character.toLowerCase(sb.charAt(j)));
        }
      }
      split[i] = sb.toString();
    }

    System.out.println(String.join(" ", split));
  }
}
