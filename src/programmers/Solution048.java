package programmers;

/**
 * 크기가 작은 부분문자열
 */
public class Solution048 {
  public static void main(String[] args) {
    String t = "10203";
    String p = "15";
    int answer = 0;

    long num = Long.parseLong(p);
    for (int i = 0; i < t.length()-p.length()+1; i++) {
      answer += Long.parseLong(t.substring(i, i+p.length())) <= num ? 1 : 0;
    }

    System.out.println(answer);
  }
}
