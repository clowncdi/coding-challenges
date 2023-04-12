package programmers;

/**
 * 문자열 내 p와 y의 개수
 */
public class Solution015 {
  public static void main(String[] args) {
    String s = "pPoopoyY";
    boolean answer = false;

    String lower = s.toLowerCase();
    if (lower.indexOf("p") < 0 && lower.indexOf("y") < 0) {
      answer = true;
    }
    int count = 0;
    for (int i = 0; i < lower.length(); i++) {
       if (lower.charAt(i) == 'p') {
         count++;
       }
      if (lower.charAt(i) == 'y') {
        count--;
      }
    }

    answer = count == 0 ? true : false;

    System.out.println(answer);
  }
}

// 간단하고 좋은 아이디어 2가지
// 정규식 변환 이후 남은 문자 길이 비교
// return s.replaceAll("[^yY]", "").length() - s.replaceAll("[^pP]", "").length() == 0
// 람다식 count 비교
// s = s.toUpperCase();
// return s.chars().filter(e -> 'P' == e).count() == s.chars().filter(e -> 'Y' == e).count();
