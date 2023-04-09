package programmers;

/**
 * 옹알이(1)
 */
public class Solution001 {
  public static void main(String[] args) {
    String[] temp = {"aya", "yee", "u", "maa", "wyeoo"};
    int answer = 0;
    String[] words = {"aya", "ye", "woo", "ma"};

    for (String s : temp) {
      for (String w : words) {
        if (isEquals(s)) break;
        System.out.print("결과: "+s+" - "+w+" = ");
        s = s.replaceFirst(w, " ");
        System.out.println(s);
      }
      if (isEquals(s)) answer++;
    }

    System.out.println(answer);
  }

  private static boolean isEquals(String s) {
    return s.trim().equals("");
  }
}
