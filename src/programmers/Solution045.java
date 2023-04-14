package programmers;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 문자열 내 마음대로 정렬하기
 */
public class Solution045 {
  public static void main(String[] args) {
    String[] strings = {"abce", "abcd", "cdx"};
    int n = 2;

    Arrays.sort(strings);
    Arrays.sort(strings, Comparator.comparingInt(s -> s.charAt(n)));

    System.out.println(Arrays.toString(strings));
  }
}
