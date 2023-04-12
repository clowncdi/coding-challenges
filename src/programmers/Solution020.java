package programmers;

/**
 * 하샤드 수
 */
public class Solution020 {
  public static void main(String[] args) {
    int x = 18;
    boolean answer = true;
//    String num = x + "";
//    int sum = 0;
//    for (int i = 0; i < num.length(); i++) {
//      sum += x%10;
//      x = x/10;
//    }
//
//    answer = Integer.parseInt(num) % sum == 0;

    // 문자 '0'이 아스키 코드 48이다. char 문자로 된 숫자를 구하려면 문자 0을 빼주는 게 간단.
    int sum = String.valueOf(x).chars().map(i -> i - '0').sum();
    answer = x % sum == 0;

    System.out.println(answer);
  }
}
