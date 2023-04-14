package programmers;

/**
 * 2016년
 */
public class Solution052 {
  public static void main(String[] args) {
    int a = 12;
    int b = 1;
    String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
    int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};

    int days = b;
    for (int i = 0; i < a-1; i++) {
      days += month[i];
    }

    System.out.println(day[days % 7 == 0 ? 6 : days % 7 - 1]);
  }
}
