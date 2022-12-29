package baekjoon;

import java.util.Scanner;

/*
17269번 - 이름궁합 테스트
 */
public class Main17269 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int name1Count = scan.nextInt();
    int name2Count = scan.nextInt();
    String name1 = scan.next();
    String name2 = scan.next();
    int[] alp = {3, 2, 1, 2, 4, 3, 1, 3, 1, 1, 3, 1, 3, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};

    int count = Math.max(name1Count, name2Count);
    int[] total = new int[name1Count + name2Count];
    int totalCount = 0;
    for (int i = 0; i < count; i++) {
      if (i < name1Count) {
        total[totalCount++] = alp[name1.charAt(i) - 65];
      }
      if (i < name2Count) {
        total[totalCount++] = alp[name2.charAt(i) - 65];
      }
    }

    while (total.length > 2) {
      int[] temp = new int[total.length - 1];
      for (int i = 0; i < temp.length; i++) {
        temp[i] = (total[i] + total[i + 1]) % 10;
      }
      total = temp;
    }

    System.out.println(Integer.parseInt(total[0]+""+total[1])+"%");
  }
}
