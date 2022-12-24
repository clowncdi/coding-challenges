package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main15969a {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int count = scan.nextInt();
    if (count < 2 || count > 1000) {
      return;
    }
    List<Integer> temp = new ArrayList<>();
    for (int i = 0; i < count; i++) {
      int j = scan.nextInt();
      if (j >= 0 && j <= 1000) {
        temp.add(j);
      }
    }
    temp.sort(Integer::compareTo);
    System.out.println(temp.get(count-1) - temp.get(0));
  }
}
