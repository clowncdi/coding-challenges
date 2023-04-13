package programmers;

import java.util.Arrays;

/**
 * 핸드폰 번호 가리기
 */
public class Solution025 {
  public static void main(String[] args) {
    String phone_number = "01033334444";
    String answer = "";

    // int star = phone_number.length() - 4;
    // answer = phone_number.substring(star);
    // java 11 이상 문법
    // "*".repeat(star) 숫자만큼 반복

    // 정규식으로 하면 더 깔끔
    answer = phone_number.replaceAll(".(?=.{4})", "*");

    // char 로 변환 후 처리하는 방법
    // char[] ch = phone_number.toCharArray();
    // for(int i = 0; i < ch.length - 4; i ++){
    //   ch[i] = '*';
    // }

    System.out.println(answer);
  }
}
