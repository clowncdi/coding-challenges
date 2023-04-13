package programmers;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 직사각형 별찍기
 */
public class Solution036 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    // for (int i = 0; i < b; i++) {
      // 아래는 이중 반복이라 제일 느림
      // for (int j = 0; j < a; j++) {
      //   System.out.print("*");
      // }
      // System.out.println();

      // 자바 11 이상이라면 "*".repeat(a) 이 간편함
    // }

    StringBuilder sb = new StringBuilder();
    for(int i=0; i<a; i++){
      sb.append("*");
    }
    // for(int i=0; i<b; i++){
    //   System.out.println(sb.toString());
    // }
    // 스트림을 이용하여 출력
    IntStream.range(0, b).forEach(i -> {
      System.out.println(sb.toString());
    });

  }
}
