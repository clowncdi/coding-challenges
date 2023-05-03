package programmers;

/**
 * 신규 아이디 추천
 *
 * 아이디의 길이는 3자 이상 15자 이하여야 합니다.
 * 아이디는 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 문자만 사용할 수 있습니다.
 * 단, 마침표(.)는 처음과 끝에 사용할 수 없으며 또한 연속으로 사용할 수 없습니다.
 */
public class Solution071 {
  public static void main(String[] args) {
    String new_id = "abcdefghijklmn.p";
    String solution = solution(new_id);
    System.out.println(solution);
  }

  public static String solution(String new_id) {
    new_id = new_id.toLowerCase();
    new_id = new_id.replaceAll("[^a-z0-9._\\-]", "");
    new_id = new_id.replaceAll("\\.{2,}", ".");
    new_id = new_id.replaceAll("^\\.|\\.$", "");
    new_id = new_id.isEmpty() ? "a" : new_id;
    new_id = new_id.length() > 15 ? new_id.substring(0, 15) : new_id;
    new_id = new_id.replaceAll("\\.$", "");
    if (new_id.length() < 3) {
      new_id = new_id + new_id.substring(new_id.length()-1) + new_id.substring(new_id.length()-1);
      new_id = new_id.substring(0, 3);
    }
    return new_id;
  }

}
