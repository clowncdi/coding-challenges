package programmers;

/**
 * 둘만의 암호
 */
public class Solution072 {
  public static void main(String[] args) {
    String s = "aukks";
    String skip = "wbqd";
    int index = 5;
    String solution = solution(s, skip, index);
    System.out.println(solution);
  }

  public static String solution(String s, String skip, int index) {
    String answer = "";

    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    alphabet = alphabet.replaceAll("["+skip+"]", "");

    for (char c : s.toCharArray()) {
      int i = alphabet.indexOf(c);
      i = (i + index) % alphabet.length();
      answer += alphabet.charAt(i);
    }

    return answer;
  }

}
