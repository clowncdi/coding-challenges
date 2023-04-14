package programmers;

import java.util.Arrays;

/**
 * [1차] 비밀지도
 * 비트 연산자 사용
 */
public class Solution044 {
  public static void main(String[] args) {
    int n = 6;
    int[] arr1 = {46, 33, 33 ,22, 31, 50};
    int[] arr2 = {27 ,56, 19, 14, 14, 10};
    String[] answer = new String[n];

    String format = "%" + n + "s";

    for (int i = 0; i < n; i++) {
      // 자바 11 이상이라면,
      // String binary = Integer.toBinaryString(arr1[i] | arr2[i]);
      // String row = n-binary.length() == 0 ? binary : "0".repeat(n-binary.length()) + binary;

      // 자바 8
      String row = String.format(format, Integer.toBinaryString(arr1[i] | arr2[i]));
      // System.out.printf("arr1=%d / arr2=%d / %s\n", arr1[i], arr2[i], row);
      row = row.replaceAll("1", "#");
      row = row.replaceAll("0", " ");
      answer[i] = row;
    }


    System.out.println(Arrays.toString(answer));
  }
}
