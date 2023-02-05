package etc;

import java.util.Scanner;

/*
* 3,6,9 게임
* 1,2,#,4,5,#,7,8,#,10,11,12,1#,14,15,1#,...
* */
public class Exam2 {
  public static void main(String[] args) {
    // 특정 숫자까지 3,6,9 진행하기
    Scanner sc = new Scanner(System.in);
    int max = sc.nextInt() + 1;
    int start = 1;
    for (int i = 1; i < max; i++) {
      if (i == start) {
        System.out.print(i);
      } else {
        System.out.printf(", ");
        String str = "" + i;
        for (int j = 0; j < str.length(); j++) {
          char num = str.charAt(j);
          if (num == '3' || num == '6' || num == '9') {
            System.out.print("#");
          } else {
            System.out.print(num);
          }
        }
      }
    }
  }
}
