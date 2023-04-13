package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 서울에서 김서방 찾기
 */
public class Solution023 {
  public static void main(String[] args) {
    String[] seoul = {"Jane", "Kim"};
    StringBuilder answer = new StringBuilder();
    int kim = Arrays.asList(seoul).indexOf("Kim");
    // String + 연상으로 합치는 것보다 StringBuilder append 연산이 훨씬 빠르다.
    answer.append("김서방은 ").append(kim).append("에 있다");

    System.out.println(answer.toString());
  }
}
