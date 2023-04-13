package programmers;

/**
 * 시저 암호
 */
public class Solution041 {
  public static void main(String[] args) {
    String s = "a B z Z A E L M Q q t";
    int n = 4;

    StringBuilder sb = new StringBuilder();
    for (int i : s.chars().toArray()) {
      if (i == ' ') {
        sb.append(" ");
        continue;
      }
      if (i <= 'Z') {
        i = i+n <= 'Z' ? i+n : i+n-'Z'+'A'-1;
      } else if (i >= 'a') {
        i = i+n <= 'z' ? i+n : i+n-'z'+'a'-1;
      }
      sb.append((char)(i));
    }

    System.out.println(sb);
  }
}
